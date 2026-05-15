package i6;

import com.hchen.superlyricapi.SuperLyricData;
import com.hchen.superlyricapi.SuperLyricPush;
import d2.C0821i;
import f0.InterfaceC0878b0;
import java.util.NoSuchElementException;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import p5.AbstractC1298a;
import r5.C1423d;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13570p;

    public /* synthetic */ r(InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f13569o = i7;
        this.f13570p = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Y4.o oVar = Y4.o.f8736a;
        InterfaceC0878b0 interfaceC0878b0 = this.f13570p;
        switch (this.f13569o) {
            case 0:
                AbstractC1209k.f(interfaceC0878b0, "$expanded");
                interfaceC0878b0.setValue(Boolean.TRUE);
                return oVar;
            case 1:
                AbstractC1209k.f(interfaceC0878b0, "$albumName");
                return Boolean.valueOf(((CharSequence) interfaceC0878b0.getValue()).length() == 0);
            case 2:
                AbstractC1209k.f(interfaceC0878b0, "$searchText");
                return Boolean.valueOf(((CharSequence) interfaceC0878b0.getValue()).length() > 0);
            case 3:
                AbstractC1209k.f(interfaceC0878b0, "$searchText");
                return Boolean.valueOf(((CharSequence) interfaceC0878b0.getValue()).length() > 0);
            case 4:
                AbstractC1209k.f(interfaceC0878b0, "$expanded");
                interfaceC0878b0.setValue(Boolean.valueOf(!((Boolean) interfaceC0878b0.getValue()).booleanValue()));
                return oVar;
            case 5:
                AbstractC1209k.f(interfaceC0878b0, "$packageName");
                SettingsLibrary.INSTANCE.setSuperLyricAPIEnabled(!r0.getSuperLyricAPIEnabled());
                SuperLyricPush.onStop(new SuperLyricData().setPackageName((String) interfaceC0878b0.getValue()));
                return oVar;
            case 6:
                AbstractC1209k.f(interfaceC0878b0, "$packageName");
                SuperLyricData packageName = new SuperLyricData().setPackageName((String) interfaceC0878b0.getValue());
                StringBuilder sb = new StringBuilder("[");
                C1423d c1423d = new C1423d(99999, 9999999, 1);
                AbstractC1298a abstractC1298a = p5.d.f15102o;
                try {
                    sb.append(g.z(c1423d));
                    sb.append("] Flamingo Lyric Debug");
                    SuperLyricPush.onSuperLyric(packageName.setLyric(sb.toString()));
                    return oVar;
                } catch (IllegalArgumentException e7) {
                    throw new NoSuchElementException(e7.getMessage());
                }
            case 7:
                AbstractC1209k.f(interfaceC0878b0, "$packageName");
                SuperLyricPush.onStop(new SuperLyricData().setPackageName((String) interfaceC0878b0.getValue()));
                return oVar;
            case 8:
                AbstractC1209k.f(interfaceC0878b0, "$showCornerSetDialog");
                interfaceC0878b0.setValue(Boolean.FALSE);
                return oVar;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                AbstractC1209k.f(interfaceC0878b0, "$showCornerSetDialog");
                interfaceC0878b0.setValue(Boolean.TRUE);
                return oVar;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                AbstractC1209k.f(interfaceC0878b0, "$music");
                return Boolean.valueOf(interfaceC0878b0.getValue() != null);
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                AbstractC1209k.f(interfaceC0878b0, "$needFullWidth");
                interfaceC0878b0.setValue(Boolean.FALSE);
                return oVar;
            default:
                AbstractC1209k.f(interfaceC0878b0, "$needFullWidth");
                Boolean bool = (Boolean) interfaceC0878b0.getValue();
                bool.getClass();
                return bool;
        }
    }
}
