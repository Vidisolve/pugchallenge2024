package com.vidisolve.openedge.qpidjms;

public class JmsConnectionFactory extends org.apache.qpid.jms.JmsConnectionFactory {
    /**
     * @param remoteURI
     *        the Broker URL to set
     */
    public void setBrokerURL(String remoteURI) {
        setRemoteURI(remoteURI);
    }
}
