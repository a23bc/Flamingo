package t;

import d5.EnumC0830a;
import e5.AbstractC0870h;
import l0.C1159c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p */
    public C1159c f15993p;

    /* JADX INFO: renamed from: q */
    public I f15994q;

    /* JADX INFO: renamed from: r */
    public long[] f15995r;

    /* JADX INFO: renamed from: s */
    public int f15996s;

    /* JADX INFO: renamed from: t */
    public int f15997t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ c5.d f15998u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ I f15999v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C1159c f16000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i7, C1159c c1159c, c5.d dVar) {
        super(dVar);
        this.f15999v = i7;
        this.f16000w = c1159c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        H h = new H(this.f15999v, this.f16000w, dVar);
        h.f15998u = (c5.d) obj;
        return h;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        t5.i iVar;
        I i7;
        long[] jArr;
        int i8;
        C1159c c1159c;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i9 = this.f15997t;
        if (i9 == 0) {
            android.support.v4.media.session.b.K(obj);
            iVar = (t5.i) this.f15998u;
            i7 = this.f15999v;
            C1445G c1445g = i7.f16002p;
            jArr = c1445g.f15988c;
            i8 = c1445g.f15990e;
            c1159c = this.f16000w;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = this.f15996s;
            jArr = this.f15995r;
            i7 = this.f15994q;
            c1159c = this.f15993p;
            iVar = (t5.i) this.f15998u;
            android.support.v4.media.session.b.K(obj);
        }
        if (i8 == Integer.MAX_VALUE) {
            return Y4.o.f8736a;
        }
        int i10 = (int) ((jArr[i8] >> 31) & 2147483647L);
        c1159c.f14153p = i8;
        Object obj2 = i7.f16002p.f15987b[i8];
        this.f15998u = iVar;
        this.f15993p = c1159c;
        this.f15994q = i7;
        this.f15995r = jArr;
        this.f15996s = i10;
        this.f15997t = 1;
        iVar.c(obj2, this);
        return enumC0830a;
    }
}
