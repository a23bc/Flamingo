package B2;

import N2.z;
import T1.q;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;
import k.AbstractC1113a;
import o5.AbstractC1267a;
import w3.N0;
import y1.AbstractC1996e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f743o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f744p;

    public /* synthetic */ e(int i7, Object obj) {
        this.f743o = i7;
        this.f744p = obj;
    }

    private final void a() {
        q qVar = (q) this.f744p;
        synchronized (qVar.f6885r) {
            try {
                if (qVar.f6889v == null) {
                    return;
                }
                try {
                    C1.l lVarD = qVar.d();
                    int i7 = lVarD.f965e;
                    if (i7 == 2) {
                        synchronized (qVar.f6885r) {
                        }
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                    }
                    try {
                        int i8 = B1.k.f727a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        z zVar = qVar.f6884q;
                        Context context = qVar.f6882o;
                        zVar.getClass();
                        C1.l[] lVarArr = {lVarD};
                        AbstractC1113a abstractC1113a = AbstractC1996e.f20278a;
                        AbstractC1267a.n("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceA = AbstractC1996e.f20278a.A(context, lVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferY = i6.g.y(qVar.f6882o, lVarD.f961a);
                            if (mappedByteBufferY == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                U3.h hVar = new U3.h(typefaceA, I0.c.O(mappedByteBufferY));
                                Trace.endSection();
                                synchronized (qVar.f6885r) {
                                    try {
                                        android.support.v4.media.session.b bVar = qVar.f6889v;
                                        if (bVar != null) {
                                            bVar.z(hVar);
                                        }
                                    } finally {
                                    }
                                }
                                qVar.b();
                            } finally {
                                int i9 = B1.k.f727a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (qVar.f6885r) {
                        try {
                            android.support.v4.media.session.b bVar2 = qVar.f6889v;
                            if (bVar2 != null) {
                                bVar2.y(th2);
                            }
                            qVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void b() {
        synchronized (((N0) this.f744p).f19023o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:373:0x01ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01b8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0174  */
    /* JADX WARN: Type inference failed for: r2v40, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [Y4.e, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.e.run():void");
    }

    public /* synthetic */ e(d1.e eVar, int i7) {
        this.f743o = 27;
        this.f744p = eVar;
    }
}
