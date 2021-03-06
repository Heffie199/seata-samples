package io.seata.samples.tcc.server;

import java.io.IOException;

import io.seata.core.store.StoreMode;
import io.seata.server.Server;

/**
 * Mock a seata server
 *
 * @author zhangsen
 */
public class SeataServerStarter {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        new FescarServer().init();
    }

    /**
     * The type Fescar server.
     */
    public static class FescarServer {

        /**
         * The Server.
         */
        Server server = null;

        /**
         * Init.
         *
         * @throws IOException the io exception
         */
        public void init() throws IOException {
            server = new Server();
            server.main(new String[] {"8091", StoreMode.FILE.name(), "127.0.0.1"});
        }
    }
}
