package y2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC2005c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f20303A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f20304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f20305t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DatagramPacket f20306u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Uri f20307v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DatagramSocket f20308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MulticastSocket f20309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InetAddress f20310y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20311z;

    public E() {
        super(true);
        this.f20304s = 8000;
        byte[] bArr = new byte[2000];
        this.f20305t = bArr;
        this.f20306u = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // y2.h
    public final void close() {
        this.f20307v = null;
        MulticastSocket multicastSocket = this.f20309x;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f20310y;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f20309x = null;
        }
        DatagramSocket datagramSocket = this.f20308w;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20308w = null;
        }
        this.f20310y = null;
        this.f20303A = 0;
        if (this.f20311z) {
            this.f20311z = false;
            p();
        }
    }

    @Override // y2.h
    public final long e(m mVar) throws D {
        Uri uri = mVar.f20345a;
        this.f20307v = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f20307v.getPort();
        q();
        try {
            this.f20310y = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f20310y, port);
            if (this.f20310y.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f20309x = multicastSocket;
                multicastSocket.joinGroup(this.f20310y);
                this.f20308w = this.f20309x;
            } else {
                this.f20308w = new DatagramSocket(inetSocketAddress);
            }
            this.f20308w.setSoTimeout(this.f20304s);
            this.f20311z = true;
            r(mVar);
            return -1L;
        } catch (IOException e7) {
            throw new D(e7, 2001);
        } catch (SecurityException e8) {
            throw new D(e8, 2006);
        }
    }

    @Override // y2.h
    public final Uri h() {
        return this.f20307v;
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) throws D {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f20303A;
        DatagramPacket datagramPacket = this.f20306u;
        if (i9 == 0) {
            try {
                DatagramSocket datagramSocket = this.f20308w;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f20303A = length;
                k(length);
            } catch (SocketTimeoutException e7) {
                throw new D(e7, 2002);
            } catch (IOException e8) {
                throw new D(e8, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i10 = this.f20303A;
        int iMin = Math.min(i10, i8);
        System.arraycopy(this.f20305t, length2 - i10, bArr, i7, iMin);
        this.f20303A -= iMin;
        return iMin;
    }
}
