package b1;

import android.media.MediaCodecInfo;
import d2.C0821i;
import f0.C0879c;
import f0.C0912t;
import java.util.Map;
import m5.AbstractC1209k;
import o0.C1245b;
import o0.C1249f;
import o0.InterfaceC1251h;
import x.C1817E0;
import yos.music.player.data.libraries.PlayList;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.ui.settingpages.others.Library;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f10018o;

    public /* synthetic */ x(int i7) {
        this.f10018o = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        char c7;
        char c8;
        char c9 = 3;
        Y4.o oVar = Y4.o.f8736a;
        switch (this.f10018o) {
            case 0:
                C1245b c1245b = (C1245b) obj;
                C0614J c0614j = (C0614J) obj2;
                C0608D c0608d = c0614j.f9935a;
                V1.a aVar = AbstractC0606B.h;
                return Z4.o.b0(AbstractC0606B.a(c0608d, aVar, c1245b), AbstractC0606B.a(c0614j.f9936b, aVar, c1245b), AbstractC0606B.a(c0614j.f9937c, aVar, c1245b), AbstractC0606B.a(c0614j.f9938d, aVar, c1245b));
            case 1:
                Boolean boolValueOf = Boolean.valueOf(((v) obj2).f10016a);
                V1.a aVar2 = AbstractC0606B.f9878a;
                return Z4.o.b0(boolValueOf, new C0626k());
            case 2:
                return Integer.valueOf(((m1.e) obj2).f14332a);
            case 3:
                m1.s sVar = (m1.s) obj2;
                m1.r rVar = new m1.r(sVar.f14360a);
                V1.a aVar3 = AbstractC0606B.f9878a;
                return Z4.o.b0(rVar, Boolean.valueOf(sVar.f14361b));
            case 4:
                ((Q0.K) obj).f5836u = true;
                return oVar;
            case 5:
                ((Integer) obj2).getClass();
                i6.z.d(C0879c.B(1), (C0912t) obj);
                return oVar;
            case 6:
                ((Integer) obj2).getClass();
                i6.z.b(C0879c.B(1), (C0912t) obj);
                return oVar;
            case 7:
                ((Integer) obj).intValue();
                YosMediaItem yosMediaItem = (YosMediaItem) obj2;
                AbstractC1209k.f(yosMediaItem, "music");
                return yosMediaItem;
            case 8:
                ((Integer) obj).intValue();
                YosMediaItem yosMediaItem2 = (YosMediaItem) obj2;
                AbstractC1209k.f(yosMediaItem2, "music");
                return yosMediaItem2;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                ((Integer) obj).intValue();
                String str = (String) obj2;
                AbstractC1209k.f(str, "album");
                return str;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                ((Integer) obj).intValue();
                String str2 = (String) obj2;
                AbstractC1209k.f(str2, "artist");
                return str2;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((Integer) obj).intValue();
                PlayList playList = (PlayList) obj2;
                AbstractC1209k.f(playList, "playList");
                return playList.getListID();
            case 12:
                ((Integer) obj).intValue();
                String name = ((MediaCodecInfo) obj2).getName();
                AbstractC1209k.e(name, "getName(...)");
                return name;
            case 13:
                C1249f c1249f = (C1249f) obj2;
                t.J j3 = c1249f.f14643p;
                Object[] objArr = j3.f16004b;
                Object[] objArr2 = j3.f16005c;
                long[] jArr = j3.f16003a;
                int length = jArr.length - 2;
                Map map = c1249f.f14642o;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j7 = jArr[i7];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((255 & j7) < 128) {
                                    int i10 = (i7 << 3) + i9;
                                    c8 = c9;
                                    Object obj3 = objArr[i10];
                                    Map mapE = ((InterfaceC1251h) objArr2[i10]).e();
                                    if (mapE.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapE);
                                    }
                                } else {
                                    c8 = c9;
                                }
                                j7 >>= 8;
                                i9++;
                                c9 = c8;
                            }
                            c7 = c9;
                            if (i8 == 8) {
                            }
                        } else {
                            c7 = c9;
                        }
                        if (i7 != length) {
                            i7++;
                            c9 = c7;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 14:
                return obj2;
            case 15:
                ((Integer) obj).intValue();
                Library library = (Library) obj2;
                AbstractC1209k.f(library, "lib");
                return library.getUniqueId();
            case 16:
                ((Integer) obj2).getClass();
                u6.L.b(C0879c.B(1), (C0912t) obj);
                return oVar;
            default:
                return Integer.valueOf(((C1817E0) obj2).f19619a.h());
        }
    }

    public /* synthetic */ x(int i7, int i8) {
        this.f10018o = i8;
    }
}
