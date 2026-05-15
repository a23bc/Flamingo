package j4;

import L3.q;
import S5.C0427g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import g4.o;
import java.nio.ByteBuffer;
import k.AbstractC1113a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.l f13707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13708c;

    public /* synthetic */ c(Object obj, p4.l lVar, int i7) {
        this.f13706a = i7;
        this.f13708c = obj;
        this.f13707b = lVar;
    }

    @Override // j4.g
    public final Object a(c5.d dVar) {
        p4.l lVar = this.f13707b;
        Object obj = this.f13708c;
        switch (this.f13706a) {
            case 0:
                return new d(new BitmapDrawable(lVar.f15078a.getResources(), (Bitmap) obj), false, g4.f.f12509p);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C0427g c0427g = new C0427g();
                    c0427g.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = lVar.f15078a;
                    return new m(new o(c0427g, null), null, g4.f.f12509p);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config config = s4.e.f15919a;
                boolean z6 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof q);
                if (z6) {
                    bitmapDrawable = new BitmapDrawable(lVar.f15078a.getResources(), AbstractC1113a.y(bitmapDrawable, lVar.f15079b, lVar.f15080c, lVar.f15081d, lVar.f15082e));
                }
                return new d(bitmapDrawable, z6, g4.f.f12509p);
        }
    }
}
