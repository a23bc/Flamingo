package O1;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: O1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0334f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public Iterator f5525o;

    /* JADX INFO: renamed from: p */
    public Object f5526p;

    /* JADX INFO: renamed from: q */
    public int f5527q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f5528r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ List f5529s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ ArrayList f5530t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334f(List list, ArrayList arrayList, c5.d dVar) {
        super(2, dVar);
        this.f5529s = list;
        this.f5530t = arrayList;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0334f c0334f = new C0334f(this.f5529s, this.f5530t, dVar);
        c0334f.f5528r = obj;
        return c0334f;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0334f) create(obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f5527q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            obj = this.f5528r;
            it = this.f5529s.iterator();
            list = this.f5530t;
        } else if (i7 == 1) {
            Object obj2 = this.f5526p;
            Iterator it2 = this.f5525o;
            List list2 = (List) this.f5528r;
            android.support.v4.media.session.b.K(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0333e(1, null));
                this.f5528r = list2;
                this.f5525o = it2;
                this.f5526p = null;
                this.f5527q = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f5525o;
            list = (List) this.f5528r;
            android.support.v4.media.session.b.K(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f5528r = list;
        this.f5525o = it;
        this.f5526p = obj;
        this.f5527q = 1;
        throw null;
    }
}
