package U5;

import H2.C0196m;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import j5.AbstractC1110d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m5.AbstractC1209k;
import u5.AbstractC1539a;
import w5.InterfaceC1765B;
import yos.music.player.SettingsActivity;
import yos.music.player.ui.settingpages.others.LibraryResponse;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f7196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7198q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(c5.d dVar, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, SettingsActivity settingsActivity) {
        super(2, dVar);
        this.f7196o = settingsActivity;
        this.f7197p = interfaceC0878b0;
        this.f7198q = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new U(dVar, this.f7197p, this.f7198q, this.f7196o);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        U u7 = (U) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        u7.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0878b0 interfaceC0878b0 = this.f7198q;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        try {
            InputStream inputStreamOpen = this.f7196o.getAssets().open("aboutlibraries.json");
            AbstractC1209k.e(inputStreamOpen, "open(...)");
            String strF = AbstractC1110d.F(new BufferedReader(new InputStreamReader(inputStreamOpen, AbstractC1539a.f17313a), 8192));
            M4.g gVar = M4.g.f4789q;
            K4.a aVar = K4.h.f4047o;
            Map map = Collections.EMPTY_MAP;
            List list = Collections.EMPTY_LIST;
            this.f7197p.setValue(((LibraryResponse) new C0196m(gVar, aVar, map, true, true, 1, list, K4.w.f4068o, K4.w.f4069p, list).b(LibraryResponse.class, strF)).getLibraries());
        } catch (IOException e7) {
            interfaceC0878b0.setValue("Cannot read file: " + e7.getMessage());
        } catch (Exception e8) {
            interfaceC0878b0.setValue("Parse error: " + e8.getMessage());
        }
        return Y4.o.f8736a;
    }
}
