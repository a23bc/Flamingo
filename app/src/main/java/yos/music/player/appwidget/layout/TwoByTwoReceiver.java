package yos.music.player.appwidget.layout;

import A0.b;
import D5.e;
import N5.d;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import b2.C0650b0;
import b2.C0652c0;
import b2.X;
import b2.Y;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public final class TwoByTwoReceiver extends AppWidgetProvider {

    /* JADX INFO: renamed from: a */
    public final e f20578a = M.f19497a;

    /* JADX INFO: renamed from: b */
    public final b f20579b = new b(14);

    public static final void a(TwoByTwoReceiver twoByTwoReceiver, InterfaceC1765B interfaceC1765B, Context context) {
        AbstractC1767D.t(interfaceC1765B, null, new C0652c0(context, twoByTwoReceiver, null), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i7, Bundle bundle) {
        d.L(this, this.f20578a, new X(this, context, i7, bundle, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        d.L(this, this.f20578a, new Y(this, context, iArr, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0083 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:73:0x0040, B:76:0x0049, B:77:0x0051, B:78:0x0052, B:79:0x005a, B:80:0x005b, B:96:0x00a6, B:86:0x0071, B:88:0x0083, B:90:0x008e, B:92:0x009a, B:91:0x0096, B:94:0x009e, B:95:0x00a5, B:83:0x0066), top: B:101:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009e A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:73:0x0040, B:76:0x0049, B:77:0x0051, B:78:0x0052, B:79:0x005a, B:80:0x005b, B:96:0x00a6, B:86:0x0071, B:88:0x0083, B:90:0x008e, B:92:0x009a, B:91:0x0096, B:94:0x009e, B:95:0x00a5, B:83:0x0066), top: B:101:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "appWidgetIds"
            java.lang.String r1 = r9.getAction()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L1b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L47
            r3 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r2 == r3) goto L66
            r3 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r2 == r3) goto L5b
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r2 == r0) goto L1f
        L1b:
            r2 = r7
            r3 = r8
            goto La6
        L1f:
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L28
            goto L1b
        L28:
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r5 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L52
            java.lang.String r0 = "EXTRA_APPWIDGET_ID"
            r1 = -1
            int r4 = r9.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L47
            if (r4 == r1) goto L49
            D5.e r9 = r7.f20578a     // Catch: java.lang.Throwable -> L47
            b2.Z r1 = new b2.Z     // Catch: java.lang.Throwable -> L47
            r6 = 0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La9
            N5.d.L(r7, r9, r1)     // Catch: java.lang.Throwable -> La9
            return
        L47:
            r2 = r7
            goto La9
        L49:
            r2 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La9
            java.lang.String r9 = "Intent is missing AppWidgetId extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La9
            throw r8     // Catch: java.lang.Throwable -> La9
        L52:
            r2 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La9
            java.lang.String r9 = "Intent is missing ActionKey extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La9
            throw r8     // Catch: java.lang.Throwable -> La9
        L5b:
            r2 = r7
            r3 = r8
            java.lang.String r8 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> La9
            if (r8 != 0) goto L71
            goto La6
        L66:
            r2 = r7
            r3 = r8
            java.lang.String r8 = "android.intent.action.LOCALE_CHANGED"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> La9
            if (r8 != 0) goto L71
            goto La6
        L71:
            android.appwidget.AppWidgetManager r8 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> La9
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = r4.getCanonicalName()     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto L9e
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La9
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> La9
            boolean r1 = r9.hasExtra(r0)     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L96
            int[] r9 = r9.getIntArrayExtra(r0)     // Catch: java.lang.Throwable -> La9
            m5.AbstractC1209k.c(r9)     // Catch: java.lang.Throwable -> La9
            goto L9a
        L96:
            int[] r9 = r8.getAppWidgetIds(r5)     // Catch: java.lang.Throwable -> La9
        L9a:
            r7.onUpdate(r3, r8, r9)     // Catch: java.lang.Throwable -> La9
            return
        L9e:
            java.lang.String r8 = "no canonical name"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La9
            r9.<init>(r8)     // Catch: java.lang.Throwable -> La9
            throw r9     // Catch: java.lang.Throwable -> La9
        La6:
            super.onReceive(r3, r9)     // Catch: java.lang.Throwable -> La9
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yos.music.player.appwidget.layout.TwoByTwoReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        d.L(this, this.f20578a, new C0650b0(this, context, iArr, null));
    }
}
