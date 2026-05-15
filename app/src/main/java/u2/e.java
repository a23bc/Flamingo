package u2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f17210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f17211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f17212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f17213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f17214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f17215g;
    public boolean h;

    public e() {
        ByteBuffer byteBuffer = d.f17209a;
        this.f17214f = byteBuffer;
        this.f17215g = byteBuffer;
        b bVar = b.f17204e;
        this.f17212d = bVar;
        this.f17213e = bVar;
        this.f17210b = bVar;
        this.f17211c = bVar;
    }

    public abstract b a(b bVar);

    @Override // u2.d
    public boolean b() {
        return this.f17213e != b.f17204e;
    }

    @Override // u2.d
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f17215g;
        this.f17215g = d.f17209a;
        return byteBuffer;
    }

    @Override // u2.d
    public final void d() {
        flush();
        this.f17214f = d.f17209a;
        b bVar = b.f17204e;
        this.f17212d = bVar;
        this.f17213e = bVar;
        this.f17210b = bVar;
        this.f17211c = bVar;
        k();
    }

    @Override // u2.d
    public final void e() {
        this.h = true;
        j();
    }

    @Override // u2.d
    public boolean f() {
        return this.h && this.f17215g == d.f17209a;
    }

    @Override // u2.d
    public final void flush() {
        this.f17215g = d.f17209a;
        this.h = false;
        this.f17210b = this.f17212d;
        this.f17211c = this.f17213e;
        i();
    }

    @Override // u2.d
    public final b g(b bVar) {
        this.f17212d = bVar;
        this.f17213e = a(bVar);
        return b() ? this.f17213e : b.f17204e;
    }

    public final ByteBuffer l(int i7) {
        if (this.f17214f.capacity() < i7) {
            this.f17214f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f17214f.clear();
        }
        ByteBuffer byteBuffer = this.f17214f;
        this.f17215g = byteBuffer;
        return byteBuffer;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
