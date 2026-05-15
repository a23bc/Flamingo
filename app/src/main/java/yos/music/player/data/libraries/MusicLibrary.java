package yos.music.player.data.libraries;

import A0.e;
import C2.I;
import E4.b0;
import H2.C0196m;
import K4.l;
import N2.z;
import N4.r;
import Y4.o;
import Z4.p;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.b;
import b6.m;
import b6.n;
import b6.t;
import com.google.gson.reflect.TypeToken;
import com.tencent.mmkv.MMKV;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import e5.InterfaceC0867e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import m5.AbstractC1209k;
import s5.InterfaceC1438c;
import t2.C1468A;
import t2.C1469B;
import t2.C1470C;
import t2.C1492v;
import t2.C1494x;
import t2.C1495y;
import t2.C1496z;
import t2.G;
import t2.J;
import u5.AbstractC1545g;
import w2.AbstractC1697a;
import w4.d;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public final class MusicLibrary {
    static final /* synthetic */ InterfaceC1438c[] $$delegatedProperties = {e.E(MusicLibrary.class, "hideSongs", "getHideSongs()Ljava/util/List;", 0), e.E(MusicLibrary.class, "folders", "getFolders()Ljava/util/List;", 0), e.E(MusicLibrary.class, "hideFoldersSaver", "getHideFoldersSaver()Ljava/util/List;", 0), e.E(MusicLibrary.class, "songSaver", "getSongSaver()Ljava/util/List;", 0)};
    public static final MusicLibrary INSTANCE = new MusicLibrary();
    private static final d folders$delegate;
    private static final d hideFoldersSaver$delegate;
    private static final d hideSongs$delegate;
    private static final d songSaver$delegate;

    public static final class Album {
        public static final Album INSTANCE = new Album();

        private Album() {
        }

        public final List<YosMediaItem> get(String str) {
            AbstractC1209k.f(str, "albumName");
            List<YosMediaItem> songs = MusicLibrary.INSTANCE.getSongs();
            ArrayList arrayList = new ArrayList();
            for (Object obj : songs) {
                String album = ((YosMediaItem) obj).getAlbum();
                if (album == null) {
                    album = "Unknown Album";
                }
                if (album.equals(str)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public static final class Artist {
        public static final Artist INSTANCE = new Artist();

        private Artist() {
        }

        public final List<YosMediaItem> get(String str) {
            AbstractC1209k.f(str, "artistName");
            List<YosMediaItem> songs = MusicLibrary.INSTANCE.getSongs();
            ArrayList arrayList = new ArrayList();
            for (Object obj : songs) {
                List<String> artistsList = YosMediaItemExtraKt.getArtistsList((YosMediaItem) obj);
                if (artistsList == null) {
                    artistsList = t.f10495a;
                }
                if (artistsList.contains(str)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: yos.music.player.data.libraries.MusicLibrary$scanMedia$2, reason: invalid class name */
    @InterfaceC0867e(c = "yos.music.player.data.libraries.MusicLibrary$scanMedia$2", f = "MusicLibrary.kt", l = {290}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC0871i implements l5.e {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, c5.d dVar) {
            super(2, dVar);
            this.$context = context;
        }

        @Override // e5.AbstractC0863a
        public final c5.d create(Object obj, c5.d dVar) {
            return new AnonymousClass2(this.$context, dVar);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
        @Override // e5.AbstractC0863a
        public final Object invokeSuspend(Object obj) {
            Uri uri;
            String path;
            EnumC0830a enumC0830a = EnumC0830a.f11264o;
            int i7 = this.label;
            if (i7 == 0) {
                b.K(obj);
                System.out.getClass();
                z zVar = new z();
                Context context = this.$context;
                this.label = 1;
                obj = zVar.v(context, this);
                if (obj == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.K(obj);
            }
            n nVar = (n) obj;
            o oVar = o.f8736a;
            if (nVar == null) {
                System.out.getClass();
                return oVar;
            }
            MusicLibrary musicLibrary = MusicLibrary.INSTANCE;
            ?? r32 = nVar.f10446a;
            ArrayList arrayList = new ArrayList(p.j0(r32));
            Iterator it = r32.iterator();
            while (it.hasNext()) {
                arrayList.add(MusicLibrary.INSTANCE.toYosMediaItem((G) it.next()));
            }
            musicLibrary.setSongSaver(arrayList);
            MusicLibrary musicLibrary2 = MusicLibrary.INSTANCE;
            Map map = nVar.f10448c.f10449a;
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                m mVar = (m) entry.getValue();
                G g6 = (G) Z4.n.r0(mVar.f10444a);
                String strS0 = (g6 == null || (uri = MediaItemExtraKt.getUri(g6)) == null || (path = uri.getPath()) == null) ? "" : AbstractC1545g.s0(path, "/");
                List list = mVar.f10444a;
                ArrayList arrayList3 = new ArrayList(p.j0(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(MusicLibrary.INSTANCE.toYosMediaItem((G) it2.next()));
                }
                arrayList2.add(new Folder(str, strS0, arrayList3));
            }
            musicLibrary2.setFolders(arrayList2);
            r32.size();
            System.out.getClass();
            MusicLibrary musicLibrary3 = MusicLibrary.INSTANCE;
            musicLibrary3.getFolders().size();
            System.out.getClass();
            musicLibrary3.getSongSaver().size();
            System.out.getClass();
            musicLibrary3.getSongs().size();
            System.out.getClass();
            return oVar;
        }

        @Override // l5.e
        public final Object invoke(InterfaceC1765B interfaceC1765B, c5.d dVar) {
            return ((AnonymousClass2) create(interfaceC1765B, dVar)).invokeSuspend(o.f8736a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0262 A[Catch: Exception -> 0x026a, TRY_LEAVE, TryCatch #5 {Exception -> 0x026a, blocks: (B:98:0x0255, B:101:0x0262), top: B:205:0x0255 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0361 A[Catch: Exception -> 0x036a, TRY_LEAVE, TryCatch #4 {Exception -> 0x036a, blocks: (B:145:0x0355, B:148:0x0361), top: B:203:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162 A[Catch: Exception -> 0x016a, TRY_LEAVE, TryCatch #6 {Exception -> 0x016a, blocks: (B:51:0x0155, B:54:0x0162), top: B:207:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0246  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v4, types: [Y4.j] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v4, types: [Y4.j] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [Y4.j] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [Y4.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static {
        /*
            Method dump skipped, instruction units count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yos.music.player.data.libraries.MusicLibrary.<clinit>():void");
    }

    private MusicLibrary() {
    }

    private final List<YosStringWrapper> getHideFoldersSaver() {
        return hideFoldersSaver$delegate.c($$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<YosMediaItem> getSongSaver() {
        return songSaver$delegate.c($$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFolders(List<Folder> list) {
        folders$delegate.d($$delegatedProperties[1], list);
    }

    private final void setHideFoldersSaver(List<YosStringWrapper> list) {
        hideFoldersSaver$delegate.d($$delegatedProperties[2], list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSongSaver(List<YosMediaItem> list) {
        songSaver$delegate.d($$delegatedProperties[3], list);
    }

    private final void updateFolderVisibility(Folder folder, boolean z6) {
        System.out.getClass();
        if (z6) {
            Objects.toString(folder);
            System.out.getClass();
            List<Folder> folders = getFolders();
            if ((folders instanceof Collection) && folders.isEmpty()) {
                return;
            }
            Iterator<T> it = folders.iterator();
            while (it.hasNext()) {
                if (AbstractC1209k.a(((Folder) it.next()).getPath(), folder.getPath())) {
                    System.out.getClass();
                    folder.getPath();
                    System.out.getClass();
                    setHideFoldersSaver(Z4.n.C0(getHideFoldersSaver(), new YosStringWrapper(folder.getPath())));
                    return;
                }
            }
            return;
        }
        Objects.toString(folder);
        System.out.getClass();
        List<String> hideFolders = getHideFolders();
        if ((hideFolders instanceof Collection) && hideFolders.isEmpty()) {
            return;
        }
        Iterator<T> it2 = hideFolders.iterator();
        while (it2.hasNext()) {
            if (AbstractC1209k.a((String) it2.next(), folder.getPath())) {
                System.out.getClass();
                folder.getPath();
                System.out.getClass();
                setHideFoldersSaver(Z4.n.A0(getHideFoldersSaver(), new YosStringWrapper(folder.getPath())));
                return;
            }
        }
    }

    public final List<String> getAlbums() {
        List<YosMediaItem> songs = getSongs();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = songs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String album = ((YosMediaItem) next).getAlbum();
            if (hashSet.add(album != null ? album : "Unknown Album")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.j0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String album2 = ((YosMediaItem) it2.next()).getAlbum();
            if (album2 == null) {
                album2 = "Unknown Album";
            }
            arrayList2.add(album2);
        }
        return arrayList2;
    }

    public final List<String> getArtists() {
        List<YosMediaItem> songs = getSongs();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = songs.iterator();
        while (it.hasNext()) {
            List<String> artistsList = YosMediaItemExtraKt.getArtistsList((YosMediaItem) it.next());
            if (artistsList == null) {
                artistsList = t.f10495a;
            }
            Z4.t.l0(arrayList, artistsList);
        }
        return Z4.n.K0(Z4.n.N0(arrayList));
    }

    public final List<Folder> getFolders() {
        return folders$delegate.c($$delegatedProperties[1]);
    }

    public final List<String> getHideFolders() {
        List<YosStringWrapper> hideFoldersSaver = getHideFoldersSaver();
        ArrayList arrayList = new ArrayList(p.j0(hideFoldersSaver));
        Iterator<T> it = hideFoldersSaver.iterator();
        while (it.hasNext()) {
            arrayList.add(((YosStringWrapper) it.next()).getValue());
        }
        return arrayList;
    }

    public final List<YosMediaItem> getHideSongs() {
        return hideSongs$delegate.c($$delegatedProperties[0]);
    }

    public final List<YosMediaItem> getSongs() {
        List<YosMediaItem> songSaver = getSongSaver();
        ArrayList arrayList = new ArrayList();
        for (Object obj : songSaver) {
            YosMediaItem yosMediaItem = (YosMediaItem) obj;
            MusicLibrary musicLibrary = INSTANCE;
            if (!musicLibrary.getHideSongs().contains(yosMediaItem)) {
                List<Folder> folders = musicLibrary.getFolders();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : folders) {
                    if (INSTANCE.getHideFolders().contains(((Folder) obj2).getPath())) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Z4.t.l0(arrayList3, ((Folder) it.next()).getSongs());
                }
                ArrayList arrayList4 = new ArrayList(p.j0(arrayList3));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((YosMediaItem) it2.next()).getUri());
                }
                if (!arrayList4.contains(yosMediaItem.getUri())) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final void hideFolder(Folder folder) {
        AbstractC1209k.f(folder, "folder");
        updateFolderVisibility(folder, true);
    }

    public final PlayListV1 loadPlayList() {
        l lVar = new l();
        lVar.b(new r(1));
        C0196m c0196mA = lVar.a();
        String strF = MMKV.p("yos_player_core").f("yos_play_list_v1");
        PlayListV1 playListV1 = (PlayListV1) (strF != null ? c0196mA.c(strF, TypeToken.get(new TypeToken<PlayListV1>() { // from class: yos.music.player.data.libraries.MusicLibrary$loadPlayList$$inlined$loadData$1
        }.getType())) : null);
        if (playListV1 == null) {
            playListV1 = new PlayListV1(null);
        }
        playListV1.toString();
        System.out.getClass();
        return playListV1;
    }

    public final PlayStatus loadPlayStatus() {
        l lVar = new l();
        lVar.b(new r(1));
        C0196m c0196mA = lVar.a();
        String strF = MMKV.p("yos_player_core").f("yos_player_play_status");
        PlayStatus playStatus = (PlayStatus) (strF != null ? c0196mA.c(strF, TypeToken.get(new TypeToken<PlayStatus>() { // from class: yos.music.player.data.libraries.MusicLibrary$loadPlayStatus$$inlined$loadData$1
        }.getType())) : null);
        return playStatus == null ? new PlayStatus(null, 0L, false, 0) : playStatus;
    }

    public final Object scanMedia(Context context, c5.d dVar) {
        Object objC = AbstractC1767D.C(M.f19498b, new AnonymousClass2(context, null), dVar);
        return objC == EnumC0830a.f11264o ? objC : o.f8736a;
    }

    public final G toMediaItem(YosMediaItem yosMediaItem) {
        C1469B c1469b;
        AbstractC1209k.f(yosMediaItem, "<this>");
        C1492v c1492v = new C1492v();
        I i7 = new I(2);
        List list = Collections.EMPTY_LIST;
        b0 b0Var = b0.f1913s;
        C1496z c1496z = new C1496z();
        C1470C c1470c = C1470C.f16192d;
        Uri uri = yosMediaItem.getUri();
        String mediaId = yosMediaItem.getMediaId();
        AbstractC1209k.c(mediaId);
        String mimeType = yosMediaItem.getMimeType();
        t2.I i8 = new t2.I();
        i8.f16239a = yosMediaItem.getTitle();
        i8.f16261y = yosMediaItem.getWriter();
        i8.f16235E = yosMediaItem.getCompilation();
        i8.f16262z = yosMediaItem.getComposer();
        i8.f16240b = yosMediaItem.getArtists();
        i8.f16241c = yosMediaItem.getAlbum();
        i8.f16242d = yosMediaItem.getAlbumArtists();
        i8.f16249m = yosMediaItem.getThumb();
        i8.f16250n = yosMediaItem.getTrackNumber();
        i8.f16232B = yosMediaItem.getDiscNumber();
        i8.f16234D = yosMediaItem.getGenre();
        i8.f16257u = yosMediaItem.getRecordingDay();
        i8.f16256t = yosMediaItem.getRecordingMonth();
        i8.f16255s = yosMediaItem.getRecordingYear();
        i8.f16258v = yosMediaItem.getReleaseYear();
        i8.c(Long.valueOf(yosMediaItem.getDuration()));
        Bundle bundle = new Bundle();
        Long artistId = yosMediaItem.getArtistId();
        if (artistId != null) {
            bundle.putLong("ArtistId", artistId.longValue());
        }
        Long albumId = yosMediaItem.getAlbumId();
        if (albumId != null) {
            bundle.putLong("AlbumId", albumId.longValue());
        }
        Long genreId = yosMediaItem.getGenreId();
        if (genreId != null) {
            bundle.putLong("GenreId", genreId.longValue());
        }
        bundle.putString("Author", yosMediaItem.getAuthor());
        Long addDate = yosMediaItem.getAddDate();
        if (addDate != null) {
            bundle.putLong("AddDate", addDate.longValue());
        }
        Long modifiedDate = yosMediaItem.getModifiedDate();
        if (modifiedDate != null) {
            bundle.putLong("ModifiedDate", modifiedDate.longValue());
        }
        Integer cdTrackNumber = yosMediaItem.getCdTrackNumber();
        if (cdTrackNumber != null) {
            bundle.putInt("CdTrackNumber", cdTrackNumber.intValue());
        }
        i8.f16238H = bundle;
        J j3 = new J(i8);
        AbstractC1697a.i(((Uri) i7.f985e) == null || ((UUID) i7.f984d) != null);
        C1495y c1495y = null;
        if (uri != null) {
            if (((UUID) i7.f984d) != null) {
                c1495y = new C1495y(i7);
            }
            c1469b = new C1469B(uri, mimeType, c1495y, null, list, null, b0Var, -9223372036854775807L);
        } else {
            c1469b = null;
        }
        return new G(mediaId, new C1494x(c1492v), c1469b, new C1468A(c1496z), j3, c1470c);
    }

    public final YosMediaItem toYosMediaItem(G g6) {
        AbstractC1209k.f(g6, "<this>");
        C1469B c1469b = g6.f16224b;
        Uri uri = c1469b != null ? c1469b.f16185a : null;
        String str = c1469b != null ? c1469b.f16186b : null;
        String title = MediaItemExtraKt.getTitle(g6);
        String writer = MediaItemExtraKt.getWriter(g6);
        String compilation = MediaItemExtraKt.getCompilation(g6);
        String composer = MediaItemExtraKt.getComposer(g6);
        List<String> artists = MediaItemExtraKt.getArtists(g6);
        String artistsString = artists != null ? MediaItemExtraKt.toArtistsString(artists) : null;
        String album = MediaItemExtraKt.getAlbum(g6);
        String albumArtists = MediaItemExtraKt.getAlbumArtists(g6);
        Uri thumb = MediaItemExtraKt.getThumb(g6);
        Integer trackNumber = MediaItemExtraKt.getTrackNumber(g6);
        Integer discNumber = MediaItemExtraKt.getDiscNumber(g6);
        String genre = MediaItemExtraKt.getGenre(g6);
        Integer recordingDay = MediaItemExtraKt.getRecordingDay(g6);
        Integer recordingMonth = MediaItemExtraKt.getRecordingMonth(g6);
        Integer recordingYear = MediaItemExtraKt.getRecordingYear(g6);
        Integer releaseYear = MediaItemExtraKt.getReleaseYear(g6);
        Bundle extras = MediaItemExtraKt.getExtras(g6);
        Long lValueOf = extras != null ? Long.valueOf(extras.getLong("ArtistId")) : null;
        Bundle extras2 = MediaItemExtraKt.getExtras(g6);
        Long l = lValueOf;
        Long lValueOf2 = extras2 != null ? Long.valueOf(extras2.getLong("AlbumId")) : null;
        Bundle extras3 = MediaItemExtraKt.getExtras(g6);
        Long l7 = lValueOf2;
        Long lValueOf3 = extras3 != null ? Long.valueOf(extras3.getLong("GenreId")) : null;
        String author = MediaItemExtraKt.getAuthor(g6);
        Bundle extras4 = MediaItemExtraKt.getExtras(g6);
        Long l8 = lValueOf3;
        Long lValueOf4 = extras4 != null ? Long.valueOf(extras4.getLong("AddDate")) : null;
        long duration = MediaItemExtraKt.getDuration(g6);
        Bundle extras5 = MediaItemExtraKt.getExtras(g6);
        Long l9 = lValueOf4;
        Long lValueOf5 = extras5 != null ? Long.valueOf(extras5.getLong("ModifiedDate")) : null;
        Bundle extras6 = MediaItemExtraKt.getExtras(g6);
        return new YosMediaItem(uri, g6.f16223a, str, title, writer, compilation, composer, artistsString, album, albumArtists, thumb, trackNumber, discNumber, genre, recordingDay, recordingMonth, recordingYear, releaseYear, l, l7, l8, author, l9, duration, lValueOf5, extras6 != null ? Integer.valueOf(extras6.getInt("CdTrackNumber")) : null);
    }

    public final void unHideFolder(Folder folder) {
        AbstractC1209k.f(folder, "folder");
        updateFolderVisibility(folder, false);
    }

    public final void updatePlayList(PlayListV1 playListV1) {
        AbstractC1209k.f(playListV1, "playListV1");
        l lVar = new l();
        lVar.b(new r(1));
        MMKV.p("yos_player_core").m("yos_play_list_v1", lVar.a().h(playListV1));
        playListV1.toString();
        System.out.getClass();
    }

    public final void updatePlayStatus(PlayStatus playStatus) {
        AbstractC1209k.f(playStatus, "playStatus");
        l lVar = new l();
        lVar.b(new r(1));
        MMKV.p("yos_player_core").m("yos_player_play_status", lVar.a().h(playStatus));
    }
}
