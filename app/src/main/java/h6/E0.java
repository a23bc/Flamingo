package h6;

import e5.AbstractC0871i;
import f0.C0886f0;
import f0.C0890h0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f12820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f12826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12828y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, C0890h0 c0890h02, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, C0886f0 c0886f0, InterfaceC0878b0 interfaceC0878b04, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f12821r = interfaceC0878b0;
        this.f12822s = c0890h0;
        this.f12823t = c0890h02;
        this.f12824u = interfaceC0878b02;
        this.f12825v = interfaceC0878b03;
        this.f12826w = c0886f0;
        this.f12827x = interfaceC0878b04;
        this.f12828y = interfaceC1182c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        E0 e02 = new E0(this.f12821r, this.f12822s, this.f12823t, this.f12824u, this.f12825v, this.f12826w, this.f12827x, this.f12828y, dVar);
        e02.f12820q = obj;
        return e02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Path cross not found for [B:33:0x00ca, B:15:0x004b], limit reached: 37 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d6 -> B:11:0x0035). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.E0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
