package com.copgogroup.model.enums;

import java.util.List;
import java.util.Arrays;
import lombok.Getter;

@Getter
public enum Book {

    // --- OLD TESTAMENT ---
    GENESIS("Gen", "Genesis", "Gen.", "Genesis"),
    EXODUS("Exod", "Exodo", "Ex.", "Exod.", "Exodus"),
    LEVITICUS("Lev", "Levitico", "Lev.", "Leviticus"),
    NUMBERS("Num", "Mga Bilang", "Num.", "Numbers", "Bilang"),
    DEUTERONOMY("Deut", "Deuteronomio", "Deut.", "Deuteronomy"),
    JOSHUA("Josh", "Josue", "Josh.", "Joshua"),
    JUDGES("Judg", "Mga Hukom", "Judg.", "Judges", "Hukom"),
    RUTH("Ruth", "Ruth", "Ru.", "Ruth"),
    FIRST_SAMUEL("1Sam", "1 Samuel", "1 Sam.", "1 Samuel", "1Sam."),
    SECOND_SAMUEL("2Sam", "2 Samuel", "2 Sam.", "2 Samuel", "2Sam."),
    FIRST_KINGS("1Kgs", "1 Mga Hari", "1 Hari", "1 Kings", "1Kgs."),
    SECOND_KINGS("2Kgs", "2 Mga Hari", "2 Hari", "2 Kings", "2Kgs."),
    FIRST_CHRONICLES("1Chr", "1 Cronica", "1 Chron.", "1 Chronicles", "1Chr."),
    SECOND_CHRONICLES("2Chr", "2 Cronica", "2 Chron.", "2 Chronicles", "2Chr."),
    EZRA("Ezra", "Ezra", "Ezr.", "Ezra"),
    NEHEMIAH("Neh", "Nehemias", "Neh.", "Nehemiah"),
    ESTHER("Esth", "Ester", "Esth.", "Esther"),
    JOB("Job", "Job", "Job"),
    PSALMS("Ps", "Mga Awit", "Ps.", "Psalm", "Psalms", "Awit"),
    PROVERBS("Prov", "Mga Kawikaan", "Prov.", "Proverbs", "Kawikaan"),
    ECCLESIASTES("Eccl", "Eclesiastes", "Eccl.", "Ecclesiastes"),
    SONG_OF_SOLOMON("Song", "Awit ni Salomon", "Song", "Song of Solomon", "Awit ni Solomon"),
    ISAIAH("Isa", "Isaias", "Isa.", "Isaiah", "Is."),
    JEREMIAH("Jer", "Jeremias", "Jer.", "Jeremiah"),
    LAMENTATIONS("Lam", "Mga Panaghoy", "Lam.", "Lamentations", "Panaghoy"),
    EZEKIEL("Ezek", "Ezekiel", "Ezek.", "Ezekiel"),
    DANIEL("Dan", "Daniel", "Dan.", "Daniel"),
    HOSEA("Hos", "Oseas", "Hos.", "Hosea"),
    JOEL("Joel", "Joel", "Joel"),
    AMOS("Amos", "Amos", "Amos"),
    OBADIAH("Obad", "Obadias", "Obad.", "Obadiah"),
    JONAH("Jonah", "Jonah", "Jon.", "Jonah"),
    MICAH("Mic", "Mikas", "Mic.", "Micah"),
    NAHUM("Nah", "Nahum", "Nah.", "Nahum"),
    HABAKKUK("Hab", "Habacuc", "Hab.", "Habakkuk"),
    ZEPHANIAH("Zeph", "Sofonias", "Zeph.", "Zephaniah"),
    HAGGAI("Hag", "Hageo", "Hag.", "Haggai"),
    ZECHARIAH("Zech", "Zacarias", "Zech.", "Zechariah"),
    MALACHI("Mal", "Malakias", "Mal.", "Malachi"),

    // --- NEW TESTAMENT ---
    MATTHEW("Matt", "Mateo", "Matt.", "Matthew", "Mat."),
    MARK("Mark", "Marcos", "Mk.", "Mark"),
    LUKE("Luke", "Lucas", "Lk.", "Luke"),
    JOHN("John", "Juan", "Jn.", "John"),
    ACTS("Acts", "Mga Gawa", "Acts", "Gawa"),
    ROMANS("Rom", "Mga Taga-Roma", "Rom.", "Romans", "Roma"),
    FIRST_CORINTHIANS("1Cor", "1 Corinto", "1 Cor.", "1 Corinthians", "1Cor."),
    SECOND_CORINTHIANS("2Cor", "2 Corinto", "2 Cor.", "2 Corinthians", "2Cor."),
    GALATIANS("Gal", "Mga Taga-Galacia", "Gal.", "Galatians", "Galacia"),
    EPHESIANS("Eph", "Efeso", "Eph.", "Ephesians"),
    PHILIPPIANS("Phil", "Mga Taga-Filipos", "Phil.", "Philippians", "Filipos"),
    COLOSSIANS("Col", "Mga Taga-Colosas", "Col.", "Colossians", "Colosas"),
    FIRST_THESSALONIANS("1Thess", "1 Tesalonica", "1 Thess.", "1 Thessalonians", "1Thess."),
    SECOND_THESSALONIANS("2Thess", "2 Tesalonica", "2 Thess.", "2 Thessalonians", "2Thess."),
    FIRST_TIMOTHY("1Tim", "1 Timoteo", "1 Tim.", "1 Timothy", "1Tim."),
    SECOND_TIMOTHY("2Tim", "2 Timoteo", "2 Tim.", "2 Timothy", "2Tim."),
    TITUS("Titus", "Tito", "Tit.", "Titus"),
    PHILEMON("Phlm", "Kay Filemon", "Phlm.", "Philemon", "Filemon"),
    HEBREWS("Heb", "Mga Hebreo", "Heb.", "Hebrews", "Hebreo"),
    JAMES("Jas", "Santiago", "Jas.", "James"),
    FIRST_PETER("1Pet", "1 Pedro", "1 Pet.", "1 Peter", "1Pet."),
    SECOND_PETER("2Pet", "2 Pedro", "2 Pet.", "2 Peter", "2Pet."),
    FIRST_JOHN("1John", "1 Juan", "1 Jn.", "1 John", "1John."),
    SECOND_JOHN("2John", "2 Juan", "2 Jn.", "2 John", "2John."),
    THIRD_JOHN("3John", "3 Juan", "3 Jn.", "3 John", "3John."),
    JUDE("Jude", "Judas", "Jude"),
    REVELATION("Rev", "Pahayag", "Rev.", "Revelation", "Apocalypse")
    ;


    private final String osisCode;
    private final String tagalogName;
    private final List<String> aliases;

    Book(String osisCode, String tagalogName, String... aliases) {
        this.osisCode = osisCode;
        this.tagalogName = tagalogName;
        this.aliases = List.of(aliases);
    }

    public static Book fromAlias(String raw) {
        if (raw == null) {
            throw new IllegalArgumentException("Book reference cannot be null");
        }

        String normalized = raw.trim();
        return Arrays.stream(values())
                .filter(b -> b.aliases.stream().anyMatch(a -> a.equalsIgnoreCase(normalized)))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown book reference: " + raw));
    }
    
}
