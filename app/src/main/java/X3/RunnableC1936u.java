package x3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

/* JADX INFO: renamed from: x3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1936u implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k.I f20105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f20106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f20107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f20109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k.I f20110t;

    public RunnableC1936u(int i7, int i8, Bundle bundle, String str, k.I i9, k.I i10) {
        this.f20110t = i9;
        this.f20105o = i10;
        this.f20106p = str;
        this.f20107q = i7;
        this.f20108r = i8;
        this.f20109s = bundle;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        k.I i7 = this.f20105o;
        IBinder binder = ((Messenger) i7.f13847p).getBinder();
        k.I i8 = this.f20110t;
        ((AbstractServiceC1940y) i8.f13847p).f20128s.remove(binder);
        C1931p c1931p = new C1931p((AbstractServiceC1940y) i8.f13847p, this.f20106p, this.f20107q, this.f20108r, i7);
        AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) i8.f13847p;
        abstractServiceC1940y.f20129t = c1931p;
        C1930o c1930oA = abstractServiceC1940y.a(this.f20109s);
        abstractServiceC1940y.f20129t = null;
        if (c1930oA == null) {
            try {
                i7.L(2, null);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        try {
            abstractServiceC1940y.f20128s.put(binder, c1931p);
            binder.linkToDeath(c1931p, 0);
            Y y6 = abstractServiceC1940y.f20131v;
            if (y6 != null) {
                i7.K(y6, c1930oA.f20090a);
            }
        } catch (RemoteException unused2) {
            abstractServiceC1940y.f20128s.remove(binder);
        }
    }
}
