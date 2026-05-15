package S5;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class D extends C0425e {

    /* JADX INFO: renamed from: m */
    public final Socket f6761m;

    public D(Socket socket) {
        this.f6761m = socket;
    }

    @Override // S5.C0425e
    public final void j() {
        Socket socket = this.f6761m;
        try {
            socket.close();
        } catch (AssertionError e7) {
            if (!M3.a.W(e7)) {
                throw e7;
            }
            t.f6809a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        } catch (Exception e8) {
            t.f6809a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
