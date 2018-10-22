

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class RemoteCaller {

	 //private static final Logger logger = LoggerFactory.getLogger(RemoteCaller.class);
	   // private PoRecService service;

	    private InitialContext ctx = null;

	    @Before
	    public void init() {
	        /**
	         * jboss4 test
	         * try {
	            Properties props = new Properties();
	            props.setProperty("java.naming.factory.initial",
	                    "org.jnp.interfaces.NamingContextFactory");
	            props.setProperty("java.naming.provider.url", "jnp://server_url:1099");
	            props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
	            ctx = new InitialContext(props);
	            service = (PoRecService) ctx.lookup(PoRecService.REMOTE);
	        } catch (Exception e) {
	            logger.error("Error in init PartLoadTest()",e);
	        }*/
	    	
	    	// * jboss6 test
    	      Properties props = new Properties(); 
              //props.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory"); 
              props.put(Context.PROVIDER_URL, "remote://server_url:4447");
              props.put(Context.SECURITY_AUTHENTICATION,"username1");
              props.put(Context.SECURITY_PRINCIPAL, "username2");
    	      props.put(Context.SECURITY_CREDENTIALS, "password");
    	      props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory"); 
	          props.put("jboss.naming.client.ejb.context", Boolean.valueOf(true)); 
    	        
    	         try {
					ctx = new InitialContext(props);
				} catch (NamingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	         
	    }

	    @After
	    public void destroy() {
	        //service = null;
	    }

	    @Test
	    public void testPartLoadService() {
	    	try {
	    		//service = (PoRecService) ctx.lookup(PoRecService.REMOTE);
				//System.out.println("test uat server----"+service.getFtpServer().getFtpServerIp());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

}
