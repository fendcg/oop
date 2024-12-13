import java.io.*;
import java.util.*;

public class Lesson {

    private LessonType type;
    private LanguageType language;
    private String room;
    private String time;
    private Teacher teacher;

    public Lesson() {
    }

    public Lesson(LessonType type, LanguageType language, String room, String time, Teacher teacher) {
        this.type = type;
        this.language = language;
        this.room = room;
        this.time = time;
        this.teacher = teacher;
    }

    public LessonType getType() {
        return type;
    }

    public void setType(LessonType type) {
        this.type = type;
    }

    public LanguageType getLanguage() {
        return language;
    }

    public void setLanguage(LanguageType language) {
        this.language = language;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
