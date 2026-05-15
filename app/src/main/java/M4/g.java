package M4;

import H2.C0196m;
import K4.x;
import K4.y;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements y, Cloneable {

    /* JADX INFO: renamed from: q */
    public static final g f4789q;

    /* JADX INFO: renamed from: o */
    public List f4790o;

    /* JADX INFO: renamed from: p */
    public List f4791p;

    static {
        g gVar = new g();
        List list = Collections.EMPTY_LIST;
        gVar.f4790o = list;
        gVar.f4791p = list;
        f4789q = gVar;
    }

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // K4.y
    public final x a(C0196m c0196m, TypeToken typeToken) {
        boolean z6;
        boolean z7;
        boolean zC = c(typeToken.getRawType());
        if (zC) {
            z6 = true;
        } else {
            b(true);
            z6 = false;
        }
        if (zC) {
            z7 = true;
        } else {
            b(false);
            z7 = false;
        }
        if (z6 || z7) {
            return new f(this, z7, z6, c0196m, typeToken);
        }
        return null;
    }

    public final void b(boolean z6) {
        Iterator it = (z6 ? this.f4790o : this.f4791p).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final Object clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }
}
