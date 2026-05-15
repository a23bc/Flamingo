package b6;

import Q0.N;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.hchen.superlyricapi.BuildConfig;
import com.kyant.taglib.Metadata;
import com.kyant.taglib.TagLib;
import d.C0746L;
import d2.C0821i;
import j5.AbstractC1110d;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import v.C1618o;
import w.S;
import w3.C1760y;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1960J;
import y0.C1987t;
import y0.InterfaceC1985r;
import yos.music.player.data.libraries.SettingsLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f10431o;

    public /* synthetic */ k(int i7) {
        this.f10431o = i7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        HashMap<String, String[]> propertyMap;
        String[] strArr;
        Y4.o oVar = Y4.o.f8736a;
        switch (this.f10431o) {
            case 0:
                String str = (String) obj;
                AbstractC1209k.f(str, "it");
                return "mime_type = '" + str + '\'';
            case 1:
                Uri uri = (Uri) obj;
                System.out.getClass();
                if (!AbstractC1209k.a(uri.getScheme(), "file")) {
                    throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
                }
                String path = uri.getPath();
                if (path == null) {
                    throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
                }
                Metadata metadata = TagLib.INSTANCE.getMetadata(ParcelFileDescriptor.open(new File(path), 268435456).detachFd(), true);
                if (metadata == null || (propertyMap = metadata.getPropertyMap()) == null || (strArr = propertyMap.get("LYRICS")) == null) {
                    return null;
                }
                return (String) Z4.l.i0(strArr);
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 3:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 4:
                C1960J c1960j = (C1960J) obj;
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.h(90.0f);
                c1960j.e(2);
                return oVar;
            case 5:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 6:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 7:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 8:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.h(null, 0.3f, 5).a(androidx.compose.animation.b.e(null, 3)), androidx.compose.animation.b.j(null, 0.3f, 5).a(androidx.compose.animation.b.f(null, 3)));
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.h(null, 0.3f, 5).a(androidx.compose.animation.b.e(null, 3)), androidx.compose.animation.b.j(null, 0.3f, 5).a(androidx.compose.animation.b.f(null, 3)));
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C1960J c1960j2 = (C1960J) obj;
                AbstractC1209k.f(c1960j2, "$this$graphicsLayer");
                c1960j2.e(2);
                return oVar;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                v0.d dVar = (v0.d) obj;
                AbstractC1209k.f(dVar, "$this$drawWithCache");
                return dVar.a(new k(12));
            case 12:
                N n7 = (N) obj;
                AbstractC1209k.f(n7, "$this$onDrawWithContent");
                w2.l lVarG = AbstractC1959I.g();
                lVarG.g(12);
                A0.c cVar = n7.f5853o;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f54p.W() >> 32));
                A0.b bVar = cVar.f54p;
                C1893c c1893c = new C1893c(0.0f, 0.0f, fIntBitsToFloat, Float.intBitsToFloat((int) (bVar.W() & 4294967295L)));
                InterfaceC1985r interfaceC1985rS = bVar.S();
                interfaceC1985rS.q(c1893c, lVarG);
                long j3 = C1987t.f20261i;
                C1987t c1987t = new C1987t(j3);
                C1987t c1987t2 = new C1987t(AbstractC1959I.c(553648128));
                C1987t c1987t3 = new C1987t(AbstractC1959I.c(1493172224));
                long j7 = C1987t.f20255b;
                List listE0 = Z4.o.e0(c1987t, c1987t2, c1987t3, new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(j7), new C1987t(AbstractC1959I.c(1493172224)), new C1987t(AbstractC1959I.c(553648128)), new C1987t(j3));
                System.out.getClass();
                n7.a();
                A0.e.w(n7, C0746L.D(14, listE0), 0L, 0L, 0.0f, null, null, 62);
                interfaceC1985rS.k();
                return oVar;
            case 13:
                C1960J c1960j3 = (C1960J) obj;
                AbstractC1209k.f(c1960j3, "$this$graphicsLayer");
                c1960j3.e(2);
                return oVar;
            case 14:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 15:
                return Integer.valueOf((int) (((double) ((Integer) obj).intValue()) / 1.3d));
            case 16:
                return Integer.valueOf((int) (((double) ((Integer) obj).intValue()) / 1.3d));
            case 17:
                float fFloatValue = ((Float) obj).floatValue();
                C1760y c1760y = i.f10423c;
                if (c1760y != null) {
                    c1760y.k((long) fFloatValue);
                }
                return oVar;
            case 18:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 19:
                float fFloatValue2 = ((Float) obj).floatValue();
                C1760y c1760y2 = i.f10423c;
                if (c1760y2 != null) {
                    c1760y2.k((long) fFloatValue2);
                }
                return oVar;
            case BuildConfig.API_VERSION /* 20 */:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                Float fValueOf = Float.valueOf(0.001f);
                return AbstractC1110d.I(androidx.compose.animation.b.h(new S(0.5f, 150.0f, fValueOf), 0.3f, 4).a(androidx.compose.animation.b.e(null, 3)), androidx.compose.animation.b.j(new S(0.5f, 150.0f, fValueOf), 0.3f, 4).a(androidx.compose.animation.b.f(null, 3)));
            case 21:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                Float fValueOf2 = Float.valueOf(0.001f);
                return AbstractC1110d.I(androidx.compose.animation.b.h(new S(0.5f, 150.0f, fValueOf2), 0.3f, 4).a(androidx.compose.animation.b.e(null, 3)), androidx.compose.animation.b.j(new S(0.5f, 150.0f, fValueOf2), 0.3f, 4).a(androidx.compose.animation.b.f(null, 3)));
            case 22:
                C1960J c1960j4 = (C1960J) obj;
                AbstractC1209k.f(c1960j4, "$this$graphicsLayer");
                c1960j4.e(1);
                return oVar;
            case 23:
                v0.d dVar2 = (v0.d) obj;
                AbstractC1209k.f(dVar2, "$this$drawWithCache");
                return dVar2.a(new k(25));
            case 24:
                YosMediaItem yosMediaItem = (YosMediaItem) obj;
                AbstractC1209k.f(yosMediaItem, "music");
                return yosMediaItem;
            case 25:
                N n8 = (N) obj;
                AbstractC1209k.f(n8, "$this$onDrawWithContent");
                long j8 = C1987t.f20261i;
                C1987t c1987t4 = new C1987t(j8);
                long j9 = C1987t.f20255b;
                List listE02 = Z4.o.e0(c1987t4, new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j9), new C1987t(j8));
                n8.a();
                A0.e.w(n8, C0746L.D(14, listE02), 0L, 0L, 0.0f, null, null, 62);
                return oVar;
            case 26:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 27:
                AbstractC1209k.f((C1618o) obj, "$this$AnimatedContent");
                return AbstractC1110d.I(androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
            case 28:
                AbstractC1209k.f((G.s) obj, "$this$item");
                return new G.b(N5.d.b(2));
            default:
                String str2 = (String) obj;
                AbstractC1209k.f(str2, "it");
                SettingsLibrary.INSTANCE.setCodec(str2);
                return oVar;
        }
    }
}
