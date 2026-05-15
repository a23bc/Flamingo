package cn.lyric.getter.api;

import b4.C0700a;
import cn.lyric.getter.api.data.ExtraData;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class API {
    public static final int API_VERSION = 6;
    public static final C0700a Companion = new C0700a();
    private final boolean hasEnable;

    public static /* synthetic */ void sendLyric$default(API api, String str, ExtraData extraData, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            extraData = new ExtraData();
        }
        api.sendLyric(str, extraData);
    }

    public final void clearLyric() {
    }

    public final boolean getHasEnable() {
        return this.hasEnable;
    }

    public final void sendLyric(String str, ExtraData extraData) {
        AbstractC1209k.f(str, "lyric");
        AbstractC1209k.f(extraData, "extra");
    }
}
