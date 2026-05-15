package k;

import R0.AbstractC0372b;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0372b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13948c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C1111A f13949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A, A0.b bVar) {
        super(layoutInflaterFactory2C1111A);
        this.f13949d = layoutInflaterFactory2C1111A;
        this.f13950e = bVar;
    }

    @Override // R0.AbstractC0372b
    public final IntentFilter d() {
        switch (this.f13948c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // R0.AbstractC0372b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f() {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.x.f():int");
    }

    @Override // R0.AbstractC0372b
    public final void j() {
        switch (this.f13948c) {
            case 0:
                this.f13949d.j(true, true);
                break;
            default:
                this.f13949d.j(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A, Context context) {
        super(layoutInflaterFactory2C1111A);
        this.f13949d = layoutInflaterFactory2C1111A;
        this.f13950e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
