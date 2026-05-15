package y1;

import C1.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import k.AbstractC1113a;

/* JADX INFO: renamed from: y1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2001j extends AbstractC1113a {
    public static Font P(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iR = R(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int iR2 = R(fontStyle, font2.getStyle());
            if (iR2 < iR) {
                font = font2;
                iR = iR2;
            }
        }
        return font;
    }

    public static FontFamily Q(l[] lVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (l lVar : lVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(lVar.f961a, "r", null);
            } catch (IOException unused) {
                continue;
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(lVar.f963c).setSlant(lVar.f964d ? 1 : 0).setTtcIndex(lVar.f962b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int R(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // k.AbstractC1113a
    public final Typeface A(Context context, l[] lVarArr, int i7) {
        try {
            FontFamily fontFamilyQ = Q(lVarArr, context.getContentResolver());
            if (fontFamilyQ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyQ).setStyle(P(fontFamilyQ, i7).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // k.AbstractC1113a
    public final Typeface B(Context context, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyQ = Q((l[]) list.get(0), contentResolver);
            if (fontFamilyQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyQ);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily fontFamilyQ2 = Q((l[]) list.get(i8), contentResolver);
                if (fontFamilyQ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyQ2);
                }
            }
            return customFallbackBuilder.setStyle(P(fontFamilyQ, i7).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // k.AbstractC1113a
    public final Typeface C(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // k.AbstractC1113a
    public final Typeface D(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // k.AbstractC1113a
    public final l F(l[] lVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // k.AbstractC1113a
    public final Typeface z(Context context, x1.e eVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (x1.f fVar : eVar.f19895a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f19901f).setWeight(fVar.f19897b).setSlant(fVar.f19898c ? 1 : 0).setTtcIndex(fVar.f19900e).setFontVariationSettings(fVar.f19899d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(P(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }
}
