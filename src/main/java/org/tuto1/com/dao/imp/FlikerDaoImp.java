package org.tuto1.com.dao.imp;

import java.io.InputStream;

import javax.swing.JOptionPane;

import org.junit.rules.Verifier;
import org.tuto1.com.dao.IflikerDAO;

import antlr.Token;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;


public class FlikerDaoImp implements IflikerDAO {

	private Flickr flickr;

    private UploadMetaData uploadMetaData = new UploadMetaData();

    private String apiKey = "20e1049837536530fb75f4f7f486536a";

    private String sharedSecret = "dd723b1e1185deba";


    private void connect(){
        flickr = new Flickr(apiKey, sharedSecret, new REST());
        Auth auth = new Auth();
        auth.setPermission(Permission.READ);
        auth.setToken("72157695889226841-2bdbe8a45692523f");
        auth.setTokenSecret("7ae750d4b7e48fc0");
        RequestContext requestContext = RequestContext.getRequestContext();
        requestContext.setAuth(auth);
        flickr.setAuth(auth);
    }

    @Override
    public String savePhoto(InputStream photo, String title) throws Exception{
        
   	connect();
    	System.out.println("ligne 1 In save");
    	uploadMetaData.setTitle(title);
    	System.out.println("ligne 2 In save"+uploadMetaData.toString());
        String photoId = flickr.getUploader().upload(photo, uploadMetaData);
        System.out.println("ligne 3 In save ");
        return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
    }

    public void auth(){
        flickr = new Flickr(apiKey, sharedSecret, new REST());

        AuthInterface authInterface = flickr.getAuthInterface();

        org.scribe.model.Token token = authInterface.getRequestToken();
        System.out.println("token: " + token);

        String url = authInterface.getAuthorizationUrl(token, Permission.DELETE);
        System.out.println("Follow this URL to authorise yourself on Flickr");
        System.out.println(url);
        System.out.println("Paste in the token it gives you:");
        System.out.print(">>");

        String tokenKey = JOptionPane.showInputDialog(null);

        org.scribe.model.Token requestToken = authInterface.getAccessToken(token, new org.scribe.model.Verifier(tokenKey));
        		//getAccessToken(token, new Verifier());
        System.out.println("Authentication success");

        Auth auth = null;
        try {
            auth = authInterface.checkToken(requestToken);
        } catch (FlickrException e) {
            e.printStackTrace();
        }

        // This token can be used until the user revokes it.
        System.out.println("Token: " + requestToken.getToken());
        System.out.println("Secret: " + requestToken.getSecret());
        System.out.println("nsid: " + auth.getUser().getId());
        System.out.println("Realname: " + auth.getUser().getRealName());
        System.out.println("Username: " + auth.getUser().getUsername());
        System.out.println("Permission: " + auth.getPermission().getType());

    }


}
