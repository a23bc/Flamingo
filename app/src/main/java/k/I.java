package k;

import E0.C0096g;
import G1.T;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.browse.MediaBrowser;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.appcompat.widget.ActionMenuView;
import e4.C0854c;
import e4.C0862k;
import j5.AbstractC1109c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.C1155j;
import l4.InterfaceC1179b;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import n4.C1230a;
import n4.C1231b;
import n4.InterfaceC1236g;
import p.C1276e;
import p.SubMenuC1271D;
import p.ViewOnKeyListenerC1277f;
import q.C1321k;
import q.E0;
import q.InterfaceC1327n;
import q.U0;
import q.X;
import r1.InterfaceC1404C;
import t.C1440B;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import u.AbstractC1525a;
import v.AbstractC1603V;
import v.AbstractC1605b;
import v.C1601T;
import v.C1602U;
import v.u0;
import w.C1655D;
import w.InterfaceC1653B;
import w.InterfaceC1654C;
import w.InterfaceC1685s;
import w.q0;
import w2.AbstractC1697a;
import x3.C1916a;
import x3.Y;

/* JADX INFO: loaded from: classes.dex */
public class I implements k3.d, InterfaceC1236g, E0, p.w, p.j, X, InterfaceC1654C, InterfaceC1685s, q0, InterfaceC1404C {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f13846o;

    /* JADX INFO: renamed from: p */
    public Object f13847p;

    public /* synthetic */ I(int i7) {
        this.f13846o = i7;
    }

    public static p4.n I(C1155j c1155j, p4.h hVar, C1230a c1230a, C1231b c1231b) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(hVar.f15053a.getResources(), c1231b.f14541a);
        g4.f fVar = g4.f.f12508o;
        Map map = c1231b.f14542b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z6 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config config = s4.e.f15919a;
        if ((c1155j instanceof C1155j) && c1155j.f14128g) {
            z6 = true;
        }
        return new p4.n(bitmapDrawable, hVar, fVar, c1230a, str, zBooleanValue, z6);
    }

    @Override // p.w
    public boolean B(p.l lVar) {
        C1321k c1321k = (C1321k) this.f13847p;
        if (lVar == c1321k.f15336q) {
            return false;
        }
        ((SubMenuC1271D) lVar).f14752A.getClass();
        c1321k.getClass();
        p.w wVar = c1321k.f15338s;
        if (wVar != null) {
            return wVar.B(lVar);
        }
        return false;
    }

    @Override // w.InterfaceC1654C
    public float C(float f7, float f8, long j3) {
        long j7 = j3 / 1000000;
        C1601T c1601tA = ((C1602U) this.f13847p).a(f8);
        long j8 = c1601tA.f18011c;
        return (Math.signum(c1601tA.f18009a) * c1601tA.f18010b * AbstractC1605b.a(j8 > 0 ? j7 / j8 : 1.0f).f18024a) + f7;
    }

    @Override // k3.d
    public int D() {
        return 1;
    }

    public C1916a E() {
        return new C1916a(((AudioAttributes.Builder) this.f13847p).build());
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0070, code lost:
    
        if (r7 != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0114 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n4.C1231b F(p4.h r18, n4.C1230a r19, q4.h r20, q4.g r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.I.F(p4.h, n4.a, q4.h, q4.g):n4.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List G(D4.i iVar) {
        String str;
        int i7;
        w2.m mVar = new w2.m((byte[]) iVar.f1584r);
        ArrayList arrayList = (E4.I) this.f13847p;
        while (mVar.a() > 0) {
            int iU = mVar.u();
            int iU2 = mVar.f18868b + mVar.u();
            if (iU == 134) {
                arrayList = new ArrayList();
                int iU3 = mVar.u() & 31;
                for (int i8 = 0; i8 < iU3; i8++) {
                    String strS = mVar.s(3, D4.d.f1569c);
                    int iU4 = mVar.u();
                    boolean z6 = (iU4 & 128) != 0;
                    if (z6) {
                        i7 = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte bU = (byte) mVar.u();
                    mVar.H(1);
                    List listSingletonList = z6 ? Collections.singletonList((bU & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C1486o c1486o = new C1486o();
                    c1486o.l = M.j(str);
                    c1486o.f16620d = strS;
                    c1486o.f16612E = i7;
                    c1486o.f16629o = listSingletonList;
                    arrayList.add(new C1487p(c1486o));
                }
            }
            mVar.G(iU2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public C1230a H(p4.h hVar, Object obj, p4.l lVar, C0854c c0854c) {
        String strA;
        Map map;
        C1230a c1230a = hVar.f15056d;
        if (c1230a != null) {
            return c1230a;
        }
        List list = ((C0862k) this.f13847p).f11599f.f11565c;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                strA = null;
                break;
            }
            Y4.h hVar2 = (Y4.h) list.get(i7);
            InterfaceC1179b interfaceC1179b = (InterfaceC1179b) hVar2.f8726o;
            if (((Class) hVar2.f8727p).isAssignableFrom(obj.getClass())) {
                AbstractC1209k.d(interfaceC1179b, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = interfaceC1179b.a(obj, lVar);
                if (strA != null) {
                    break;
                }
            }
            i7++;
        }
        if (strA == null) {
            return null;
        }
        Map map2 = hVar.f15076z.f15091o;
        if (map2.isEmpty()) {
            map = Z4.w.f8819o;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
            map = linkedHashMap;
        }
        hVar.h.getClass();
        return map.isEmpty() ? new C1230a(strA) : new C1230a(strA, Z4.y.q0(map));
    }

    public void J(View view, int i7, boolean z6) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f13847p).notifyViewVisibilityChanged(view, i7, z6);
        }
    }

    public void K(Y y6, Bundle bundle) throws RemoteException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("extra_service_version", 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", "androidx.media3.session.MediaLibraryService");
        bundle2.putParcelable("data_media_session_token", j0.k.s(y6, MediaSessionCompat$Token.CREATOR));
        bundle2.putBundle("data_root_hints", bundle);
        L(1, bundle2);
    }

    public void L(int i7, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i7;
        messageObtain.arg1 = 2;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        ((Messenger) this.f13847p).send(messageObtain);
    }

    public void M(Object obj) {
        boolean z6 = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f13847p;
        if (!z6) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    public I N(int i7) {
        if (i7 == 16) {
            i7 = 12;
        }
        ((AudioAttributes.Builder) this.f13847p).setUsage(i7);
        return this;
    }

    public /* bridge */ I O(int i7) {
        return N(i7);
    }

    @Override // w.q0
    public boolean a() {
        ((U3.h) this.f13847p).getClass();
        return false;
    }

    @Override // p.w
    public void b(p.l lVar, boolean z6) {
        if (lVar instanceof SubMenuC1271D) {
            ((SubMenuC1271D) lVar).f14753z.k().c(false);
        }
        p.w wVar = ((C1321k) this.f13847p).f15338s;
        if (wVar != null) {
            wVar.b(lVar, z6);
        }
    }

    @Override // r1.InterfaceC1404C
    public long c(n1.l lVar, long j3, n1.n nVar, long j7) {
        long j8 = ((n1.k) ((InterfaceC1180a) this.f13847p).a()).f14514a;
        return (((long) AbstractC1109c.l(lVar.f14516a + ((int) (j8 >> 32)), (int) (j7 >> 32), (int) (j3 >> 32), nVar == n1.n.f14521o)) << 32) | (((long) AbstractC1109c.l(lVar.f14517b + ((int) (j8 & 4294967295L)), (int) (j7 & 4294967295L), (int) (j3 & 4294967295L), true)) & 4294967295L);
    }

    @Override // k3.d
    public int d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // w.q0
    public long e(w.r rVar, w.r rVar2, w.r rVar3) {
        return ((U3.h) this.f13847p).e(rVar, rVar2, rVar3);
    }

    @Override // w.q0
    public w.r f(w.r rVar, w.r rVar2, w.r rVar3) {
        return ((U3.h) this.f13847p).f(rVar, rVar2, rVar3);
    }

    @Override // q.E0
    public void g(p.l lVar, p.n nVar) {
        ((ViewOnKeyListenerC1277f) this.f13847p).f14793t.removeCallbacksAndMessages(lVar);
    }

    @Override // w.InterfaceC1685s
    public InterfaceC1653B get(int i7) {
        switch (this.f13846o) {
            case 15:
                return (C1655D) this.f13847p;
            default:
                return (InterfaceC1653B) this.f13847p;
        }
    }

    @Override // n4.InterfaceC1236g
    public C1231b h(C1230a c1230a) {
        return null;
    }

    @Override // k3.d
    public long j(int i7) {
        AbstractC1697a.d(i7 == 0);
        return 0L;
    }

    @Override // w.InterfaceC1654C
    public long k(float f7) {
        return ((long) (Math.exp(((C1602U) this.f13847p).b(f7) / (((double) AbstractC1603V.f18014a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // w.InterfaceC1654C
    public float l() {
        return 0.0f;
    }

    @Override // w.InterfaceC1654C
    public float m(float f7, float f8) {
        C1602U c1602u = (C1602U) this.f13847p;
        double dB = c1602u.b(f8);
        double d4 = AbstractC1603V.f18014a;
        return (Math.signum(f8) * ((float) (Math.exp((d4 / (d4 - 1.0d)) * dB) * ((double) (c1602u.f18012o * c1602u.f18013p))))) + f7;
    }

    @Override // w.q0
    public w.r o(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return ((U3.h) this.f13847p).o(j3, rVar, rVar2, rVar3);
    }

    @Override // n4.InterfaceC1236g
    public void p(C1230a c1230a, Bitmap bitmap, Map map) {
        ((C1.k) this.f13847p).h(c1230a, bitmap, map, i6.h.y(bitmap));
    }

    @Override // p.j
    public void r(p.l lVar) {
        U0 u02 = ((ActionMenuView) this.f13847p).f9036I;
        if (u02 != null) {
            u02.r(lVar);
        }
    }

    @Override // k3.d
    public List s(long j3) {
        return j3 >= 0 ? (List) this.f13847p : Collections.EMPTY_LIST;
    }

    @Override // w.InterfaceC1654C
    public float t(long j3, float f7) {
        long j7 = j3 / 1000000;
        C1601T c1601tA = ((C1602U) this.f13847p).a(f7);
        long j8 = c1601tA.f18011c;
        return (((Math.signum(c1601tA.f18009a) * AbstractC1605b.a(j8 > 0 ? j7 / j8 : 1.0f).f18025b) * c1601tA.f18010b) / j8) * 1000.0f;
    }

    @Override // w.q0
    public w.r w(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return ((U3.h) this.f13847p).w(j3, rVar, rVar2, rVar3);
    }

    @Override // p.j
    public boolean x(p.l lVar, MenuItem menuItem) {
        InterfaceC1327n interfaceC1327n = ((ActionMenuView) this.f13847p).f9041N;
        if (interfaceC1327n == null) {
            return false;
        }
        ((U0) interfaceC1327n).f15230o.f9077U.e0();
        return false;
    }

    @Override // q.E0
    public void y(p.l lVar, p.n nVar) {
        ViewOnKeyListenerC1277f viewOnKeyListenerC1277f = (ViewOnKeyListenerC1277f) this.f13847p;
        viewOnKeyListenerC1277f.f14793t.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1277f.f14795v;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (lVar == ((C1276e) arrayList.get(i7)).f14773b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i8 = i7 + 1;
        viewOnKeyListenerC1277f.f14793t.postAtTime(new T(this, i8 < arrayList.size() ? (C1276e) arrayList.get(i8) : null, nVar, lVar, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    public /* synthetic */ I(int i7, Object obj) {
        this.f13846o = i7;
        this.f13847p = obj;
    }

    public I(n1.d dVar) {
        this.f13846o = 13;
        this.f13847p = new C1602U(u0.f18182a, dVar);
    }

    public I(C0862k c0862k, V1.a aVar) {
        this.f13846o = 3;
        this.f13847p = c0862k;
    }

    public I(long[] jArr) {
        C1440B c1440b;
        this.f13846o = 6;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c1440b = new C1440B(jArrCopyOf.length);
            int i7 = c1440b.f15965b;
            if (i7 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i7;
                    long[] jArr2 = c1440b.f15964a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        AbstractC1209k.e(jArrCopyOf2, "copyOf(...)");
                        c1440b.f15964a = jArrCopyOf2;
                    }
                    long[] jArr3 = c1440b.f15964a;
                    int i8 = c1440b.f15965b;
                    if (i7 != i8) {
                        Z4.l.Y(jArr3, jArr3, jArrCopyOf.length + i7, i7, i8);
                    }
                    Z4.l.Y(jArrCopyOf, jArr3, i7, 0, jArrCopyOf.length);
                    c1440b.f15965b += jArrCopyOf.length;
                }
            } else {
                AbstractC1525a.d("");
                throw null;
            }
        } else {
            c1440b = new C1440B(16);
        }
        this.f13847p = c1440b;
    }

    public I(float f7, float f8, w.r rVar) {
        InterfaceC1685s i7;
        this.f13846o = 17;
        if (rVar != null) {
            i7 = new C0096g(f7, f8, rVar);
        } else {
            i7 = new I(f7, f8);
        }
        this.f13847p = new U3.h(i7);
    }

    public I(float f7, float f8) {
        this.f13846o = 15;
        this.f13847p = new C1655D(f7, f8, 0.01f);
    }

    @Override // n4.InterfaceC1236g
    public void A() {
    }

    public I() {
        this.f13846o = 19;
        this.f13847p = new AudioAttributes.Builder();
    }

    @Override // q.X
    public void i(int i7) {
    }

    @Override // n4.InterfaceC1236g
    public void q(int i7) {
    }

    @Override // q.X
    public void u(int i7) {
    }

    @Override // q.X
    public void z(int i7, float f7) {
    }
}
