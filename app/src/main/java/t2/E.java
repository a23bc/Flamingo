package t2;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import w2.AbstractC1697a;
import w3.C1709a;
import w3.C1751t0;
import w3.InterfaceC1730i0;
import w3.N0;
import w3.v1;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public class E implements InterfaceC1730i0 {

    /* JADX INFO: renamed from: o */
    public String f16199o;

    /* JADX INFO: renamed from: p */
    public int f16200p;

    /* JADX INFO: renamed from: q */
    public int f16201q;

    /* JADX INFO: renamed from: r */
    public Object f16202r;

    /* JADX INFO: renamed from: s */
    public Object f16203s;

    /* JADX INFO: renamed from: t */
    public Object f16204t;

    /* JADX INFO: renamed from: u */
    public Object f16205u;

    public E(N0 n02) {
        this(n02, new c0(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x01e3  */
    @Override // w3.InterfaceC1730i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1.k a(w3.C1751t0 r28, E4.I r29, C1.k r30, w3.InterfaceC1728h0 r31) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.E.a(w3.t0, E4.I, C1.k, w3.h0):C1.k");
    }

    public int[] c(C1751t0 c1751t0, E4.b0 b0Var, u1.i iVar, C1.k kVar) {
        int[] iArr;
        int i7;
        E4.b0 b0Var2 = b0Var;
        int[] iArr2 = new int[3];
        int[] iArr3 = new int[3];
        int i8 = -1;
        Arrays.fill(iArr2, -1);
        Arrays.fill(iArr3, -1);
        int i9 = 0;
        int i10 = 0;
        while (i9 < b0Var2.f1915r) {
            C1709a c1709a = (C1709a) b0Var2.get(i9);
            v1 v1Var = c1709a.f19123a;
            CharSequence charSequence = c1709a.f19128f;
            int i11 = c1709a.f19126d;
            int i12 = c1709a.f19124b;
            if (v1Var != null) {
                kVar.getClass();
                i7 = 1;
                AbstractC1697a.d(v1Var != null && v1Var.f19382a == 0);
                v1Var.getClass();
                N0 n02 = (N0) kVar.f960p;
                PorterDuff.Mode mode = IconCompat.f9346k;
                IconCompat iconCompatB = IconCompat.b(n02.getResources(), n02.getPackageName(), i11);
                Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                intent.setData(c1751t0.f19363a.f18899b);
                iArr = iArr3;
                intent.setComponent(new ComponentName(n02, n02.getClass()));
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", v1Var.f19383b);
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", v1Var.f19384c);
                int i13 = kVar.f959o + 1;
                kVar.f959o = i13;
                iVar.f17160b.add(new u1.h(iconCompatB, charSequence, PendingIntent.getService(n02, i13, intent, (w2.t.f18881a >= 23 ? 67108864 : 0) | 134217728)));
            } else {
                iArr = iArr3;
                i7 = 1;
                AbstractC1697a.i(i12 != i8);
                PorterDuff.Mode mode2 = IconCompat.f9346k;
                Context context = (Context) this.f16202r;
                context.getClass();
                iVar.f17160b.add(new u1.h(IconCompat.b(context.getResources(), context.getPackageName(), i11), charSequence, kVar.c(c1751t0, i12)));
            }
            if (i10 != 3) {
                int i14 = c1709a.f19129g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
                if (i14 >= 0 && i14 < 3) {
                    i10++;
                    iArr2[i14] = i9;
                } else if (i12 == 7 || i12 == 6) {
                    iArr[0] = i9;
                } else {
                    int i15 = i7;
                    if (i12 == i15) {
                        iArr[i15] = i9;
                    } else if (i12 == 9 || i12 == 8) {
                        iArr[2] = i9;
                    }
                }
            }
            i9++;
            b0Var2 = b0Var;
            iArr3 = iArr;
            i8 = -1;
        }
        int[] iArr4 = iArr3;
        if (i10 == 0) {
            int i16 = 0;
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = iArr4[i17];
                if (i18 != -1) {
                    iArr2[i16] = i18;
                    i16++;
                }
            }
        }
        for (int i19 = 0; i19 < 3; i19++) {
            if (iArr2[i19] == -1) {
                return Arrays.copyOf(iArr2, i19);
            }
        }
        return iArr2;
    }

    public E(Context context, c0 c0Var) {
        this.f16202r = context;
        this.f16203s = c0Var;
        this.f16199o = "default_channel_id";
        this.f16200p = R.string.default_notification_channel_name;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        AbstractC1697a.j(notificationManager);
        this.f16204t = notificationManager;
        this.f16201q = R.drawable.media3_notification_small_icon;
    }

    @Override // w3.InterfaceC1730i0
    public void b(C1751t0 c1751t0, String str, Bundle bundle) {
    }
}
