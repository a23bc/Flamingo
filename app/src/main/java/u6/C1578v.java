package u6;

import e5.AbstractC0871i;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0894j0;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: u6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1578v extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int f17879A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ p0.s f17880B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ p0.s f17881C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ float f17882D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC1182c f17883E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C0886f0 f17884F;

    /* JADX INFO: renamed from: o */
    public Object f17885o;

    /* JADX INFO: renamed from: p */
    public Object f17886p;

    /* JADX INFO: renamed from: q */
    public int f17887q;

    /* JADX INFO: renamed from: r */
    public int f17888r;

    /* JADX INFO: renamed from: s */
    public int f17889s;

    /* JADX INFO: renamed from: t */
    public float f17890t;

    /* JADX INFO: renamed from: u */
    public int f17891u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f17892v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0894j0 f17893w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0888g0 f17894x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f17895y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f17896z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578v(C0894j0 c0894j0, C0888g0 c0888g0, float f7, int i7, int i8, p0.s sVar, p0.s sVar2, float f8, InterfaceC1182c interfaceC1182c, C0886f0 c0886f0, c5.d dVar) {
        super(2, dVar);
        this.f17893w = c0894j0;
        this.f17894x = c0888g0;
        this.f17895y = f7;
        this.f17896z = i7;
        this.f17879A = i8;
        this.f17880B = sVar;
        this.f17881C = sVar2;
        this.f17882D = f8;
        this.f17883E = interfaceC1182c;
        this.f17884F = c0886f0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1578v c1578v = new C1578v(this.f17893w, this.f17894x, this.f17895y, this.f17896z, this.f17879A, this.f17880B, this.f17881C, this.f17882D, this.f17883E, this.f17884F, dVar);
        c1578v.f17892v = obj;
        return c1578v;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1578v) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0151 A[Catch: all -> 0x005d, TryCatch #5 {all -> 0x005d, blocks: (B:181:0x004f, B:186:0x0075, B:190:0x0095, B:223:0x0185, B:214:0x014b, B:216:0x0151, B:218:0x0168, B:224:0x018e, B:193:0x00a6, B:196:0x00bb, B:199:0x00c6, B:202:0x00ce, B:203:0x00dc, B:205:0x00e0, B:206:0x00fb, B:207:0x0118, B:209:0x0121, B:211:0x013c, B:213:0x0142), top: B:316:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x018e A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #5 {all -> 0x005d, blocks: (B:181:0x004f, B:186:0x0075, B:190:0x0095, B:223:0x0185, B:214:0x014b, B:216:0x0151, B:218:0x0168, B:224:0x018e, B:193:0x00a6, B:196:0x00bb, B:199:0x00c6, B:202:0x00ce, B:203:0x00dc, B:205:0x00e0, B:206:0x00fb, B:207:0x0118, B:209:0x0121, B:211:0x013c, B:213:0x0142), top: B:316:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01a6 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #0 {all -> 0x01f1, blocks: (B:228:0x019e, B:230:0x01a6, B:233:0x01b0, B:235:0x01b6), top: B:306:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0263 A[Catch: all -> 0x01e6, TryCatch #2 {all -> 0x01e6, blocks: (B:284:0x02eb, B:286:0x02f1, B:289:0x0308, B:258:0x0248, B:280:0x02d1, B:241:0x01d1, B:251:0x01fd, B:253:0x0226, B:255:0x022c, B:283:0x02e7, B:261:0x0263, B:269:0x0278, B:271:0x027d, B:274:0x0297, B:273:0x028b), top: B:310:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x02d1 A[Catch: all -> 0x01e6, TryCatch #2 {all -> 0x01e6, blocks: (B:284:0x02eb, B:286:0x02f1, B:289:0x0308, B:258:0x0248, B:280:0x02d1, B:241:0x01d1, B:251:0x01fd, B:253:0x0226, B:255:0x022c, B:283:0x02e7, B:261:0x0263, B:269:0x0278, B:271:0x027d, B:274:0x0297, B:273:0x028b), top: B:310:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02f1 A[Catch: all -> 0x01e6, TryCatch #2 {all -> 0x01e6, blocks: (B:284:0x02eb, B:286:0x02f1, B:289:0x0308, B:258:0x0248, B:280:0x02d1, B:241:0x01d1, B:251:0x01fd, B:253:0x0226, B:255:0x022c, B:283:0x02e7, B:261:0x0263, B:269:0x0278, B:271:0x027d, B:274:0x0297, B:273:0x028b), top: B:310:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0358  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:252:0x0224 -> B:188:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x022a -> B:188:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:256:0x0244 -> B:310:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:278:0x02c7 -> B:279:0x02cf). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C1578v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
