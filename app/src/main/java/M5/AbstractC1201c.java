package m5;

import java.io.Serializable;
import s5.InterfaceC1436a;

/* JADX INFO: renamed from: m5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1201c implements InterfaceC1436a, Serializable {

    /* JADX INFO: renamed from: o */
    public transient InterfaceC1436a f14419o;

    /* JADX INFO: renamed from: p */
    public final Object f14420p;

    /* JADX INFO: renamed from: q */
    public final Class f14421q;

    /* JADX INFO: renamed from: r */
    public final String f14422r;

    /* JADX INFO: renamed from: s */
    public final String f14423s;

    /* JADX INFO: renamed from: t */
    public final boolean f14424t;

    public AbstractC1201c(Object obj, Class cls, String str, String str2, boolean z6) {
        this.f14420p = obj;
        this.f14421q = cls;
        this.f14422r = str;
        this.f14423s = str2;
        this.f14424t = z6;
    }

    public abstract InterfaceC1436a e();

    public final InterfaceC1202d f() {
        Class cls = this.f14421q;
        if (!this.f14424t) {
            return AbstractC1221w.a(cls);
        }
        AbstractC1221w.f14440a.getClass();
        return new C1212n(cls);
    }
}
