package org.dizitart.no2.sync.message;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DisconnectAckTest {
    @Test
    public void testCanEqual() {
        assertFalse((new DisconnectAck()).canEqual("other"));
    }

    @Test
    public void testEquals() {
        DisconnectAck disconnectAck = new DisconnectAck();
        disconnectAck.setHeader(new MessageHeader());
        DisconnectAck disconnectAck1 = new DisconnectAck();
        disconnectAck1.setHeader(new MessageHeader());
        assertTrue(disconnectAck.equals(disconnectAck1));
    }

    @Test
    public void testEquals2() {
        assertFalse((new DisconnectAck()).equals("o"));
    }

    @Test
    public void testEquals3() {
        DisconnectAck disconnectAck = new DisconnectAck();
        disconnectAck.setHeader(new MessageHeader());
        assertFalse((new DisconnectAck()).equals(disconnectAck));
    }

    @Test
    public void testEquals4() {
        DisconnectAck disconnectAck = new DisconnectAck();
        disconnectAck.setHeader(new MessageHeader());
        assertFalse(disconnectAck.equals(new DisconnectAck()));
    }

    @Test
    public void testEquals5() {
        DisconnectAck disconnectAck = new DisconnectAck();
        assertTrue(disconnectAck.equals(new DisconnectAck()));
    }

    @Test
    public void testHashCode() {
        DisconnectAck disconnectAck = new DisconnectAck();
        disconnectAck.setHeader(new MessageHeader());
        assertEquals(64204717, disconnectAck.hashCode());
    }

    @Test
    public void testHashCode2() {
        assertEquals(102, (new DisconnectAck()).hashCode());
    }

    @Test
    public void testSetHeader() {
        DisconnectAck disconnectAck = new DisconnectAck();
        disconnectAck.setHeader(new MessageHeader());
        assertEquals("DisconnectAck(header=MessageHeader(id=null, correlationId=null, collection=null, userName=null,"
                + " timestamp=null, messageType=null, origin=null))", disconnectAck.toString());
    }

    @Test
    public void testToString() {
        assertEquals("DisconnectAck(header=null)", (new DisconnectAck()).toString());
    }
}

