package U5;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.PlayListV1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PlayListV1 f7224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7225p;

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new c0(2, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: Exception -> 0x000f, TRY_LEAVE, TryCatch #0 {Exception -> 0x000f, blocks: (B:6:0x000b, B:20:0x005a, B:22:0x0060, B:13:0x001d, B:15:0x0032), top: B:27:0x0005 }] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r13.f7225p
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yos.music.player.data.libraries.PlayListV1 r0 = r13.f7224o
            android.support.v4.media.session.b.K(r14)     // Catch: java.lang.Exception -> Lf
            goto L59
        Lf:
            r0 = move-exception
            r14 = r0
            goto L6a
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            android.support.v4.media.session.b.K(r14)
            yos.music.player.data.libraries.MusicLibrary r14 = yos.music.player.data.libraries.MusicLibrary.INSTANCE     // Catch: java.lang.Exception -> Lf
            yos.music.player.data.libraries.PlayListV1 r1 = r14.loadPlayList()     // Catch: java.lang.Exception -> Lf
            yos.music.player.data.libraries.PlayStatus r14 = r14.loadPlayStatus()     // Catch: java.lang.Exception -> Lf
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Exception -> Lf
            r3.getClass()     // Catch: java.lang.Exception -> Lf
            yos.music.player.data.libraries.YosMediaItem r3 = r14.getMusic()     // Catch: java.lang.Exception -> Lf
            if (r3 == 0) goto L5a
            b6.i r4 = b6.i.f10421a     // Catch: java.lang.Exception -> Lf
            yos.music.player.data.libraries.YosMediaItem r5 = r14.getMusic()     // Catch: java.lang.Exception -> Lf
            java.util.List r6 = r1.getPlayingMusicList()     // Catch: java.lang.Exception -> Lf
            m5.AbstractC1209k.c(r6)     // Catch: java.lang.Exception -> Lf
            long r7 = r14.getPosition()     // Catch: java.lang.Exception -> Lf
            boolean r9 = r14.getShuffleModeEnabled()     // Catch: java.lang.Exception -> Lf
            int r10 = r14.getRepeatMode()     // Catch: java.lang.Exception -> Lf
            r13.f7224o = r1     // Catch: java.lang.Exception -> Lf
            r13.f7225p = r2     // Catch: java.lang.Exception -> Lf
            r11 = 0
            r12 = r13
            java.lang.Object r14 = r4.a(r5, r6, r7, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lf
            if (r14 != r0) goto L58
            return r0
        L58:
            r0 = r1
        L59:
            r1 = r0
        L5a:
            java.util.List r14 = r1.getPlayingMusicList()     // Catch: java.lang.Exception -> Lf
            if (r14 == 0) goto L6d
            f0.j0 r14 = b6.i.f10422b     // Catch: java.lang.Exception -> Lf
            java.util.List r0 = r1.getPlayingMusicList()     // Catch: java.lang.Exception -> Lf
            r14.setValue(r0)     // Catch: java.lang.Exception -> Lf
            goto L6d
        L6a:
            r14.printStackTrace()
        L6d:
            Y4.o r14 = Y4.o.f8736a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
