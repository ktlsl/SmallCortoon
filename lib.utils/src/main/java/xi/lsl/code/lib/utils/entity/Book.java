package xi.lsl.code.lib.utils.entity;


/**
 * book msg
 * Created by lishoulin on 2017/2/14.
 */

public class Book {


    private int Id;
    private String Title;
    private String FrontCover;
    private String RefreshTime;
    private String RefreshTimeStr;
    private String Explain;
    private String SerializedState;
    private String Author;
    private int LastChapterNo;
    private int ClassifyId;
    private LastChapterBean LastChapter;
    private Object Chapters;
    private Object MoreUrl;
    private boolean Recommend;
    private int Copyright;
    private int Sort;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFrontCover() {
        return FrontCover;
    }

    public void setFrontCover(String frontCover) {
        FrontCover = frontCover;
    }

    public String getRefreshTime() {
        return RefreshTime;
    }

    public void setRefreshTime(String refreshTime) {
        RefreshTime = refreshTime;
    }

    public String getRefreshTimeStr() {
        return RefreshTimeStr;
    }

    public void setRefreshTimeStr(String refreshTimeStr) {
        RefreshTimeStr = refreshTimeStr;
    }

    public String getExplain() {
        return Explain;
    }

    public void setExplain(String explain) {
        Explain = explain;
    }

    public String getSerializedState() {
        return SerializedState;
    }

    public void setSerializedState(String serializedState) {
        SerializedState = serializedState;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getLastChapterNo() {
        return LastChapterNo;
    }

    public void setLastChapterNo(int lastChapterNo) {
        LastChapterNo = lastChapterNo;
    }

    public int getClassifyId() {
        return ClassifyId;
    }

    public void setClassifyId(int classifyId) {
        ClassifyId = classifyId;
    }

    public LastChapterBean getLastChapter() {
        return LastChapter;
    }

    public void setLastChapter(LastChapterBean lastChapter) {
        LastChapter = lastChapter;
    }

    public Object getChapters() {
        return Chapters;
    }

    public void setChapters(Object chapters) {
        Chapters = chapters;
    }

    public Object getMoreUrl() {
        return MoreUrl;
    }

    public void setMoreUrl(Object moreUrl) {
        MoreUrl = moreUrl;
    }

    public boolean isRecommend() {
        return Recommend;
    }

    public void setRecommend(boolean recommend) {
        Recommend = recommend;
    }

    public int getCopyright() {
        return Copyright;
    }

    public void setCopyright(int copyright) {
        Copyright = copyright;
    }

    public int getSort() {
        return Sort;
    }

    public void setSort(int sort) {
        Sort = sort;
    }

    public class LastChapterBean {


        private Object AnotherId;
        private int Id;
        private String Title;
        private int Sort;
        private String FrontCover;
        private Object Images;
        private String RefreshTime;
        private String RefreshTimeStr;
        private Object Book;
        private String PostUser;
        private int ChapterNo;
        private int Reel;
        private int BookId;
        private int ChapterType;
        private Object DownLoadUrl;
        private Object Copyright;
        private Object Tencent;
        private Object ExceptionChapter;
        private String CreateTime;


        public Object getAnotherId() {
            return AnotherId;
        }

        public void setAnotherId(Object anotherId) {
            AnotherId = anotherId;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public int getSort() {
            return Sort;
        }

        public void setSort(int sort) {
            Sort = sort;
        }

        public String getFrontCover() {
            return FrontCover;
        }

        public void setFrontCover(String frontCover) {
            FrontCover = frontCover;
        }

        public Object getImages() {
            return Images;
        }

        public void setImages(Object images) {
            Images = images;
        }

        public String getRefreshTime() {
            return RefreshTime;
        }

        public void setRefreshTime(String refreshTime) {
            RefreshTime = refreshTime;
        }

        public String getRefreshTimeStr() {
            return RefreshTimeStr;
        }

        public void setRefreshTimeStr(String refreshTimeStr) {
            RefreshTimeStr = refreshTimeStr;
        }

        public Object getBook() {
            return Book;
        }

        public void setBook(Object book) {
            Book = book;
        }

        public String getPostUser() {
            return PostUser;
        }

        public void setPostUser(String postUser) {
            PostUser = postUser;
        }

        public int getChapterNo() {
            return ChapterNo;
        }

        public void setChapterNo(int chapterNo) {
            ChapterNo = chapterNo;
        }

        public int getReel() {
            return Reel;
        }

        public void setReel(int reel) {
            Reel = reel;
        }

        public int getBookId() {
            return BookId;
        }

        public void setBookId(int bookId) {
            BookId = bookId;
        }

        public int getChapterType() {
            return ChapterType;
        }

        public void setChapterType(int chapterType) {
            ChapterType = chapterType;
        }

        public Object getDownLoadUrl() {
            return DownLoadUrl;
        }

        public void setDownLoadUrl(Object downLoadUrl) {
            DownLoadUrl = downLoadUrl;
        }

        public Object getCopyright() {
            return Copyright;
        }

        public void setCopyright(Object copyright) {
            Copyright = copyright;
        }

        public Object getTencent() {
            return Tencent;
        }

        public void setTencent(Object tencent) {
            Tencent = tencent;
        }

        public Object getExceptionChapter() {
            return ExceptionChapter;
        }

        public void setExceptionChapter(Object exceptionChapter) {
            ExceptionChapter = exceptionChapter;
        }

        public String getCreateTime() {
            return CreateTime;
        }

        public void setCreateTime(String createTime) {
            CreateTime = createTime;
        }
    }

}
