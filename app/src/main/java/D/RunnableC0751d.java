package d;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0751d implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0759l f10757p;

    public /* synthetic */ RunnableC0751d(AbstractActivityC0759l abstractActivityC0759l, int i7) {
        this.f10756o = i7;
        this.f10757p = abstractActivityC0759l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10756o) {
            case 0:
                AbstractActivityC0759l abstractActivityC0759l = this.f10757p;
                AbstractC1209k.f(abstractActivityC0759l, "this$0");
                abstractActivityC0759l.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e7) {
                    if (!AbstractC1209k.a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e7;
                    }
                    return;
                } catch (NullPointerException e8) {
                    if (!AbstractC1209k.a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e8;
                    }
                    return;
                }
        }
    }
}
