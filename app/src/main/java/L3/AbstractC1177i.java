package l3;

import A2.I;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import k3.j;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: l3.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1177i implements k3.e {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f14244a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f14245b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue f14246c;

    /* JADX INFO: renamed from: d */
    public C1175g f14247d;

    /* JADX INFO: renamed from: e */
    public long f14248e;

    /* JADX INFO: renamed from: f */
    public long f14249f;

    /* JADX INFO: renamed from: g */
    public long f14250g;

    public AbstractC1177i() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f14244a.add(new C1175g());
        }
        this.f14245b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            ArrayDeque arrayDeque = this.f14245b;
            I i9 = new I(18, this);
            C1176h c1176h = new C1176h();
            c1176h.f14243v = i9;
            arrayDeque.add(c1176h);
        }
        this.f14246c = new PriorityQueue();
        this.f14250g = -9223372036854775807L;
    }

    @Override // z2.c
    public final void b(long j3) {
        this.f14250g = j3;
    }

    @Override // z2.c
    public final void c(k3.i iVar) {
        AbstractC1697a.d(iVar == this.f14247d);
        C1175g c1175g = (C1175g) iVar;
        long j3 = this.f14250g;
        if (j3 == -9223372036854775807L || c1175g.f21117u >= j3) {
            long j7 = this.f14249f;
            this.f14249f = 1 + j7;
            c1175g.f14242z = j7;
            this.f14246c.add(c1175g);
        } else {
            c1175g.f();
            this.f14244a.add(c1175g);
        }
        this.f14247d = null;
    }

    @Override // k3.e
    public final void d(long j3) {
        this.f14248e = j3;
    }

    @Override // z2.c
    public final Object f() {
        AbstractC1697a.i(this.f14247d == null);
        ArrayDeque arrayDeque = this.f14244a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C1175g c1175g = (C1175g) arrayDeque.pollFirst();
        this.f14247d = c1175g;
        return c1175g;
    }

    @Override // z2.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f14249f = 0L;
        this.f14248e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f14246c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f14244a;
            if (zIsEmpty) {
                break;
            }
            C1175g c1175g = (C1175g) priorityQueue.poll();
            int i7 = t.f18881a;
            c1175g.f();
            arrayDeque.add(c1175g);
        }
        C1175g c1175g2 = this.f14247d;
        if (c1175g2 != null) {
            c1175g2.f();
            arrayDeque.add(c1175g2);
            this.f14247d = null;
        }
    }

    public abstract k.I g();

    public abstract void h(C1175g c1175g);

    @Override // z2.c
    /* JADX INFO: renamed from: i */
    public j e() {
        ArrayDeque arrayDeque = this.f14245b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f14246c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            C1175g c1175g = (C1175g) priorityQueue.peek();
            int i7 = t.f18881a;
            if (c1175g.f21117u > this.f14248e) {
                return null;
            }
            C1175g c1175g2 = (C1175g) priorityQueue.poll();
            boolean zC = c1175g2.c(4);
            ArrayDeque arrayDeque2 = this.f14244a;
            if (zC) {
                j jVar = (j) arrayDeque.pollFirst();
                jVar.a(4);
                c1175g2.f();
                arrayDeque2.add(c1175g2);
                return jVar;
            }
            h(c1175g2);
            if (j()) {
                k.I iG = g();
                j jVar2 = (j) arrayDeque.pollFirst();
                long j3 = c1175g2.f21117u;
                jVar2.f21121q = j3;
                jVar2.f14041t = iG;
                jVar2.f14042u = j3;
                c1175g2.f();
                arrayDeque2.add(c1175g2);
                return jVar2;
            }
            c1175g2.f();
            arrayDeque2.add(c1175g2);
        }
    }

    public abstract boolean j();

    @Override // z2.c
    public void a() {
    }
}
