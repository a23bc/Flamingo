package yos.music.player.data.libraries;

import I0.c;
import N5.l;
import Y4.h;
import Z4.n;
import Z4.o;
import Z4.p;
import Z4.y;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m5.AbstractC1209k;
import t2.C1469B;
import t2.G;
import u5.AbstractC1545g;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaItemExtraKt {
    private static final Map<String, String> PLACEHOLDER_TO_ARTIST;
    private static final List<String> SPECIAL_ARTISTS;
    private static final Map<String, String> SPECIAL_ARTIST_PLACEHOLDERS;

    static {
        List<String> listE0 = o.e0("VH (Vast & Hazy)", "AC/DC", "The Mamas & The Papas", "King Gizzard & The Lizard Wizard", "25時、ナイトコードで。", "25時、ナイトコードで", "Simon & Garfunkel", "Crosby, Stills & Nash", "神様、僕は気づいてしまった", "K/DA", "MC $oho & KidNey", "Hall & Oates", "リリィ、さよなら。", "Iron & Wine", "ハロー、ハッピーワールド", "ハロー、ハッピーワールド！", "ハロー、ハッピーワールド!", "MYTH & ROID", "Emerson, Lake & Palmer", "Earth, Wind & Fire", "Tears & Years", "伍佰 & China Blue");
        SPECIAL_ARTISTS = listE0;
        List listG0 = n.G0(listE0, new Comparator() { // from class: yos.music.player.data.libraries.MediaItemExtraKt$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return l.r(Integer.valueOf(((String) t8).length()), Integer.valueOf(((String) t7).length()));
            }
        });
        ArrayList arrayList = new ArrayList(p.j0(listG0));
        int i7 = 0;
        for (Object obj : listG0) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                o.i0();
                throw null;
            }
            arrayList.add(new h((String) obj, Z1.l.o(i7, "__", "__")));
            i7 = i8;
        }
        Map<String, String> mapO0 = y.o0(arrayList);
        SPECIAL_ARTIST_PLACEHOLDERS = mapO0;
        Set<Map.Entry<String, String>> setEntrySet = mapO0.entrySet();
        int iK0 = y.k0(p.j0(setEntrySet));
        if (iK0 < 16) {
            iK0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iK0);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getValue(), (String) entry.getKey());
        }
        PLACEHOLDER_TO_ARTIST = linkedHashMap;
    }

    public static final String getAlbum(G g6) {
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16306c;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static final String getAlbumArtists(G g6) {
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16307d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static final List<String> getArtists(G g6) {
        String string;
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16305b;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            return null;
        }
        return toMultipleArtists(string);
    }

    public static final String getAuthor(G g6) {
        AbstractC1209k.f(g6, "<this>");
        Bundle bundle = g6.f16226d.f16303I;
        if (bundle != null) {
            return bundle.getString("Author");
        }
        return null;
    }

    public static final String getCompilation(G g6) {
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16300F;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static final String getComposer(G g6) {
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16295A;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static final Integer getDiscNumber(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16297C;
    }

    public static final long getDuration(G g6) {
        AbstractC1209k.f(g6, "<this>");
        Long l = g6.f16226d.h;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final Bundle getExtras(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16303I;
    }

    public static final String getGenre(G g6) {
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16299E;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static final Integer getRecordingDay(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16323v;
    }

    public static final Integer getRecordingMonth(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16322u;
    }

    public static final Integer getRecordingYear(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16321t;
    }

    public static final Integer getReleaseYear(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16324w;
    }

    public static final Uri getThumb(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16314m;
    }

    public static final String getTitle(G g6) {
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16304a;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static final Integer getTrackNumber(G g6) {
        AbstractC1209k.f(g6, "<this>");
        return g6.f16226d.f16315n;
    }

    public static final Uri getUri(G g6) {
        AbstractC1209k.f(g6, "<this>");
        C1469B c1469b = g6.f16224b;
        if (c1469b != null) {
            return c1469b.f16185a;
        }
        return null;
    }

    public static final String getWriter(G g6) {
        AbstractC1209k.f(g6, "<this>");
        CharSequence charSequence = g6.f16226d.f16327z;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static final String toArtistsString(List<String> list) {
        AbstractC1209k.f(list, "<this>");
        return n.w0(list, "\u2009/\u2009", null, null, null, 62);
    }

    public static final List<String> toMultipleArtists(String str) {
        AbstractC1209k.f(str, "<this>");
        String string = AbstractC1545g.u0(str).toString();
        for (Map.Entry<String, String> entry : SPECIAL_ARTIST_PLACEHOLDERS.entrySet()) {
            string = AbstractC1552n.I(string, entry.getKey(), entry.getValue());
        }
        String str2 = null;
        int i7 = 0;
        for (String str3 : o.e0("、", "/", "&", ";", "；", ",", "＆")) {
            int size = AbstractC1545g.k0(string, new String[]{str3}).size() - 1;
            if (size > i7) {
                str2 = str3;
                i7 = size;
            }
        }
        List listK0 = str2 != null ? AbstractC1545g.k0(string, new String[]{str2}) : c.G(string);
        ArrayList arrayList = new ArrayList(p.j0(listK0));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            String string2 = AbstractC1545g.u0((String) it.next()).toString();
            String str4 = PLACEHOLDER_TO_ARTIST.get(string2);
            if (str4 != null) {
                string2 = str4;
            }
            arrayList.add(string2);
        }
        return arrayList;
    }
}
