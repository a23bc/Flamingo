package M;

import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.InterfaceC0878b0;
import h6.J0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import u5.AbstractC1545g;
import v.C1593K;
import x0.C1892b;
import y0.C1987t;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.data.libraries.YosMediaItemExtraKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4699o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f4700p;

    public /* synthetic */ t0(InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f4699o = i7;
        this.f4700p = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f4699o) {
            case 0:
                return new H.F(4, this.f4700p);
            case 1:
                ((InterfaceC1182c) this.f4700p.getValue()).b((C1892b) obj);
                return Y4.o.f8736a;
            case 2:
                this.f4700p.setValue((O0.C) obj);
                return Y4.o.f8736a;
            case 3:
                this.f4700p.setValue((O0.C) obj);
                return Y4.o.f8736a;
            case 4:
                this.f4700p.setValue((O0.C) obj);
                return Y4.o.f8736a;
            case 5:
                String str = (String) obj;
                InterfaceC0878b0 interfaceC0878b0 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b0, "$nowLabel");
                AbstractC1209k.f(str, "it");
                interfaceC0878b0.setValue(str);
                return Y4.o.f8736a;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                InterfaceC0878b0 interfaceC0878b02 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b02, "$isPlaying");
                interfaceC0878b02.setValue(bool);
                return Y4.o.f8736a;
            case 7:
                String str2 = (String) obj;
                InterfaceC0878b0 interfaceC0878b03 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b03, "$nowPageNowPlaying");
                AbstractC1209k.f(str2, "it");
                interfaceC0878b03.setValue(str2);
                return Y4.o.f8736a;
            case 8:
                this.f4700p.setValue((X.E) obj);
                return Y4.o.f8736a;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC0878b0 interfaceC0878b04 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b04, "$randomMusicList");
                return ((List) interfaceC0878b04.getValue()).get(iIntValue);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                InterfaceC0878b0 interfaceC0878b05 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b05, "$shuffleModeEnabled");
                interfaceC0878b05.setValue(bool2);
                return Y4.o.f8736a;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                InterfaceC0878b0 interfaceC0878b06 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b06, "$shuffleModeEnabled");
                interfaceC0878b06.setValue(bool3);
                return Y4.o.f8736a;
            case 12:
                YosMediaItem yosMediaItem = (YosMediaItem) obj;
                String title = yosMediaItem.getTitle();
                if (title == null) {
                    title = "Unknown Work";
                }
                InterfaceC0878b0 interfaceC0878b07 = this.f4700p;
                boolean z6 = true;
                if (!AbstractC1545g.N(title, (CharSequence) interfaceC0878b07.getValue(), true)) {
                    List<String> artistsList = YosMediaItemExtraKt.getArtistsList(yosMediaItem);
                    if (artistsList == null) {
                        artistsList = b6.t.f10495a;
                    }
                    if ((artistsList instanceof Collection) && artistsList.isEmpty()) {
                        z6 = false;
                    } else {
                        Iterator<T> it = artistsList.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1545g.N((String) it.next(), (CharSequence) interfaceC0878b07.getValue(), true)) {
                            }
                        }
                        z6 = false;
                    }
                }
                return Boolean.valueOf(z6);
            case 13:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                InterfaceC0878b0 interfaceC0878b08 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b08, "$expanded");
                interfaceC0878b08.setValue(bool4);
                return Y4.o.f8736a;
            case 14:
                O0.C c7 = (O0.C) obj;
                InterfaceC0878b0 interfaceC0878b09 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b09, "$buttonPosition");
                AbstractC1209k.f(c7, "it");
                if (Float.intBitsToFloat((int) (((C1892b) interfaceC0878b09.getValue()).f19867a & 4294967295L)) == 0.0f) {
                    interfaceC0878b09.setValue(new C1892b(c7.I(0L)));
                }
                return Y4.o.f8736a;
            case 15:
                String str3 = (String) obj;
                InterfaceC0878b0 interfaceC0878b010 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b010, "$searchText");
                AbstractC1209k.f(str3, "it");
                interfaceC0878b010.setValue(str3);
                return Y4.o.f8736a;
            case 16:
                return Boolean.valueOf(AbstractC1545g.N((String) obj, (CharSequence) this.f4700p.getValue(), true));
            case 17:
                String str4 = (String) obj;
                InterfaceC0878b0 interfaceC0878b011 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b011, "$searchText");
                AbstractC1209k.f(str4, "it");
                interfaceC0878b011.setValue(str4);
                return Y4.o.f8736a;
            case 18:
                return Boolean.valueOf(AbstractC1545g.N((String) obj, (CharSequence) this.f4700p.getValue(), true));
            case 19:
                String str5 = (String) obj;
                InterfaceC0878b0 interfaceC0878b012 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b012, "$searchText");
                AbstractC1209k.f(str5, "it");
                interfaceC0878b012.setValue(str5);
                return Y4.o.f8736a;
            case BuildConfig.API_VERSION /* 20 */:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                InterfaceC0878b0 interfaceC0878b013 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b013, "$expanded");
                interfaceC0878b013.setValue(bool5);
                return Y4.o.f8736a;
            case 21:
                F.u uVar = (F.u) obj;
                InterfaceC0878b0 interfaceC0878b014 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b014, "$codecInfos");
                AbstractC1209k.f(uVar, "$this$Title");
                v6.E.b(uVar, new t0(interfaceC0878b014, 22));
                return Y4.o.f8736a;
            case 22:
                v6.l lVar = (v6.l) obj;
                InterfaceC0878b0 interfaceC0878b015 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b015, "$codecInfos");
                AbstractC1209k.f(lVar, "$this$yosRoundColumn");
                List list = (List) interfaceC0878b015.getValue();
                lVar.b(list.size(), new J(new b1.x(12), 9, list), new J0(6, list), new n0.d(2039820996, new U5.W(list, 5, interfaceC0878b015), true));
                return Y4.o.f8736a;
            case 23:
                v0.d dVar = (v0.d) obj;
                InterfaceC0878b0 interfaceC0878b016 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b016, "$useBackground");
                AbstractC1209k.f(dVar, "$this$drawWithCache");
                return dVar.a(new C1593K(new t0(interfaceC0878b016, 24), 4));
            case 24:
                A0.f fVar = (A0.f) obj;
                InterfaceC0878b0 interfaceC0878b017 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b017, "$useBackground");
                AbstractC1209k.f(fVar, "$this$onDrawBehind");
                if (((Boolean) interfaceC0878b017.getValue()).booleanValue()) {
                    System.out.getClass();
                    A0.e.x(0.0f, 126, C1987t.f20255b, 0L, fVar);
                }
                return Y4.o.f8736a;
            case 25:
                v0.d dVar2 = (v0.d) obj;
                InterfaceC0878b0 interfaceC0878b018 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b018, "$useBackground");
                AbstractC1209k.f(dVar2, "$this$drawWithCache");
                return dVar2.a(new C1593K(new t0(interfaceC0878b018, 26), 4));
            case 26:
                A0.f fVar2 = (A0.f) obj;
                InterfaceC0878b0 interfaceC0878b019 = this.f4700p;
                AbstractC1209k.f(interfaceC0878b019, "$useBackground");
                AbstractC1209k.f(fVar2, "$this$onDrawBehind");
                if (((Boolean) interfaceC0878b019.getValue()).booleanValue()) {
                    A0.e.x(0.0f, 126, C1987t.f20255b, 0L, fVar2);
                }
                return Y4.o.f8736a;
            case 27:
                Float f7 = (Float) obj;
                f7.getClass();
                ((InterfaceC1182c) this.f4700p.getValue()).b(f7);
                return Y4.o.f8736a;
            default:
                Float f8 = (Float) obj;
                f8.getClass();
                return Float.valueOf(((Number) ((InterfaceC1182c) this.f4700p.getValue()).b(f8)).floatValue());
        }
    }
}
