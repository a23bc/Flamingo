package V5;

import Y4.o;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.Objects;
import u6.L;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bitmap f7623o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Bitmap bitmap, c5.d dVar) {
        super(2, dVar);
        this.f7623o = bitmap;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new k(this.f7623o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapA;
        Bitmap bitmapCreateBitmap;
        o oVar = o.f8736a;
        Bitmap bitmap = this.f7623o;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        try {
            Objects.toString(bitmap);
            System.out.getClass();
            a6.b.f8885c.setValue(bitmap);
            if (bitmap != null) {
                try {
                    bitmapA = e6.a.a(bitmap, 2);
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return oVar;
                }
            } else {
                bitmapA = null;
            }
            Bitmap bitmapE = bitmapA == null ? null : L.e(bitmapA, true);
            a6.b.f8886d.setValue(bitmapE);
            if (bitmapE == null) {
                bitmapCreateBitmap = null;
            } else {
                Paint paint = new Paint();
                Bitmap.Config config = bitmapE.getConfig();
                bitmapCreateBitmap = config != null ? Bitmap.createBitmap(bitmapE.getWidth(), bitmapE.getHeight(), config) : null;
                if (bitmapCreateBitmap != null) {
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawBitmap(bitmapE, 0.0f, 0.0f, paint);
                    canvas.drawColor(1728053247, PorterDuff.Mode.ADD);
                }
            }
            if (bitmapCreateBitmap != null) {
                a6.b.f8887e.setValue(new C1987t(AbstractC1959I.c(bitmapCreateBitmap.getPixel(bitmapCreateBitmap.getWidth() / 3, (int) (((double) bitmapCreateBitmap.getHeight()) / 1.8d)))));
            } else {
                a6.b.f8887e.setValue(new C1987t(C1987t.f20259f));
            }
            if (bitmapA == null) {
                return null;
            }
            bitmapA.recycle();
            return oVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            return oVar;
        }
    }
}
