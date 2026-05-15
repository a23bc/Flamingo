package l6;

import B5.n;
import Y4.o;
import android.net.Uri;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;
import y3.x;
import yos.music.player.data.libraries.MusicLibrary;
import yos.music.player.data.libraries.PlayList;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ PlayList f14261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f14262q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlayList playList, x xVar, c5.d dVar) {
        super(2, dVar);
        this.f14261p = playList;
        this.f14262q = xVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e(this.f14261p, this.f14262q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f14260o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            PlayList playList = this.f14261p;
            String name = playList.getName();
            List<Uri> songDataList = playList.getSongDataList();
            List<YosMediaItem> songs = MusicLibrary.INSTANCE.getSongs();
            ArrayList arrayList = new ArrayList(songDataList.size());
            int size = songDataList.size();
            int i8 = 0;
            while (true) {
                Object obj2 = null;
                if (i8 >= size) {
                    break;
                }
                Uri uri = songDataList.get(i8);
                Iterator<T> it = songs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC1209k.a(((YosMediaItem) next).getUri(), uri)) {
                        obj2 = next;
                        break;
                    }
                }
                YosMediaItem yosMediaItem = (YosMediaItem) obj2;
                if (yosMediaItem != null) {
                    arrayList.add(yosMediaItem);
                }
                i8++;
            }
            a6.a.a(name, arrayList);
            D5.e eVar = M.f19497a;
            x5.d dVar = n.f912a;
            d dVar2 = new d(this.f14262q, null);
            this.f14260o = 1;
            if (AbstractC1767D.C(dVar, dVar2, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return o.f8736a;
    }
}
