package y0;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: y0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1990w {
    public static final ColorSpace a(z0.c cVar) {
        if (AbstractC1209k.a(cVar, z0.d.f21037e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21047q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21048r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21045o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21041j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21040i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21050t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21049s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21042k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (AbstractC1209k.a(cVar, z0.d.l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21039g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (AbstractC1209k.a(cVar, z0.d.h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21038f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21043m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21046p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (AbstractC1209k.a(cVar, z0.d.f21044n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            ColorSpace colorSpace = AbstractC1209k.a(cVar, z0.d.f21052v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : AbstractC1209k.a(cVar, z0.d.f21053w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof z0.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        z0.q qVar = (z0.q) cVar;
        float[] fArrA = qVar.f21083d.a();
        z0.r rVar = qVar.f21086g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f21096b, rVar.f21097c, rVar.f21098d, rVar.f21099e, rVar.f21100f, rVar.f21101g, rVar.f21095a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(cVar.f21030a, qVar.h, fArrA, transferParameters);
        }
        String str = cVar.f21030a;
        final z0.p pVar = qVar.l;
        final int i7 = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: y0.v
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d4) {
                switch (i7) {
                }
                return ((Number) ((z0.p) pVar).b(Double.valueOf(d4))).doubleValue();
            }
        };
        final z0.p pVar2 = qVar.f21092o;
        final int i8 = 1;
        return new ColorSpace.Rgb(str, qVar.h, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: y0.v
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d4) {
                switch (i8) {
                }
                return ((Number) ((z0.p) pVar2).b(Double.valueOf(d4))).doubleValue();
            }
        }, qVar.f21084e, qVar.f21085f);
    }
}
