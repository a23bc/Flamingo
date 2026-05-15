package D2;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC1479h;
import w2.AbstractC1697a;
import z2.InterfaceC2080a;

/* JADX INFO: loaded from: classes.dex */
public final class A implements w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final B2.g f1454r = new B2.g(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final UUID f1455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MediaDrm f1456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1457q;

    public A(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC1479h.f16468b;
        AbstractC1697a.c("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f1455o = uuid;
        MediaDrm mediaDrm = new MediaDrm((w2.t.f18881a >= 27 || !AbstractC1479h.f16469c.equals(uuid)) ? uuid : uuid2);
        this.f1456p = mediaDrm;
        this.f1457q = 1;
        if (AbstractC1479h.f16470d.equals(uuid) && "ASUS_Z00AD".equals(w2.t.f18884d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // D2.w
    public final InterfaceC2080a D(byte[] bArr) {
        b();
        int i7 = w2.t.f18881a;
        UUID uuid = this.f1455o;
        if (i7 < 27 && AbstractC1479h.f16469c.equals(uuid)) {
            uuid = AbstractC1479h.f16468b;
        }
        return new x(uuid, bArr);
    }

    @Override // D2.w
    public final void G(byte[] bArr, B2.p pVar) {
        if (w2.t.f18881a >= 31) {
            try {
                z.b(this.f1456p, bArr, pVar);
            } catch (UnsupportedOperationException unused) {
                AbstractC1697a.w("setLogSessionId failed.");
            }
        }
    }

    @Override // D2.w
    public final boolean J(String str, byte[] bArr) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (w2.t.f18881a >= 31) {
            zRequiresSecureDecoderComponent = z.a(this.f1456p, str);
        } else {
            MediaCrypto mediaCrypto = null;
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(this.f1455o, bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    zRequiresSecureDecoderComponent = true;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return zRequiresSecureDecoderComponent && !b();
    }

    @Override // D2.w
    public final byte[] K() {
        return this.f1456p.openSession();
    }

    @Override // D2.w
    public final void L(final f fVar) {
        this.f1456p.setOnEventListener(new MediaDrm.OnEventListener() { // from class: D2.y
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
                A a4 = this.f1540a;
                f fVar2 = fVar;
                a4.getClass();
                HandlerC0087c handlerC0087c = fVar2.f1493a.f1508K;
                handlerC0087c.getClass();
                handlerC0087c.obtainMessage(i7, bArr).sendToTarget();
            }
        });
    }

    @Override // D2.w
    public final synchronized void a() {
        int i7 = this.f1457q - 1;
        this.f1457q = i7;
        if (i7 == 0) {
            this.f1456p.release();
        }
    }

    public final boolean b() {
        return w2.t.f18881a < 21 && AbstractC1479h.f16470d.equals(this.f1455o) && "L3".equals(this.f1456p.getPropertyString("securityLevel"));
    }

    @Override // D2.w
    public final void g(byte[] bArr, byte[] bArr2) {
        this.f1456p.restoreKeys(bArr, bArr2);
    }

    @Override // D2.w
    public final Map h(byte[] bArr) {
        return this.f1456p.queryKeyStatus(bArr);
    }

    @Override // D2.w
    public final void j(byte[] bArr) {
        this.f1456p.closeSession(bArr);
    }

    @Override // D2.w
    public final byte[] o(byte[] bArr, byte[] bArr2) {
        if (AbstractC1479h.f16469c.equals(this.f1455o) && w2.t.f18881a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(w2.t.k(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if (i7 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(D4.d.f1569c);
            } catch (JSONException e7) {
                AbstractC1697a.n("Failed to adjust response data: ".concat(w2.t.k(bArr2)), e7);
            }
        }
        return this.f1456p.provideKeyResponse(bArr, bArr2);
    }

    @Override // D2.w
    public final v s() {
        MediaDrm.ProvisionRequest provisionRequest = this.f1456p.getProvisionRequest();
        return new v(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // D2.w
    public final void u(byte[] bArr) throws DeniedByServerException {
        this.f1456p.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    @Override // D2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final D2.u x(byte[] r15, java.util.List r16, int r17, java.util.HashMap r18) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.A.x(byte[], java.util.List, int, java.util.HashMap):D2.u");
    }

    @Override // D2.w
    public final int y() {
        return 2;
    }
}
