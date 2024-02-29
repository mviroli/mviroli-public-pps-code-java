package u01.clean.pre;

public class HtmlExample {

    public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuffer buffer = new StringBuffer();
        if (pageData.hasAttribute("Test")) {
            if (includeSuiteSetup) {
                WikiPage setup = PageCrawlerImpl.getInheritedPage(Responder.SETUP_NAME, wikiPage);
                if (setup != null) {
                    WikiPagePath pagePath = setup.getPageCrawler().getFullPath(setup);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -setup .").append(pagePathName).append("\n");
                }
            }
            WikiPage setup = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
            if (setup != null) {
                WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
                String setupPathName = PathParser.render(setupPath);
                buffer.append("!include -setup .").append(setupPathName).append("\n");
            }
        }
        buffer.append(pageData.getContent());
        if (pageData.hasAttribute("Test")) {
            WikiPage teardown = PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
            if (teardown != null) {
                WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
                String tearDownPathName = PathParser.render(tearDownPath);
                buffer.append("\n").append("!include -teardown .").append(tearDownPathName).append("\n");
            }
            if (includeSuiteSetup) {
                WikiPage tearDown = PageCrawlerImpl.getInheritedPage(Responder.TEARDOWN_NAME, wikiPage);
                if (tearDown != null) {
                    WikiPagePath pagePath = tearDown.getPageCrawler().getFullPath(tearDown);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -teardown .").append(pagePathName).append("\n");
                }
            }
        }
        pageData.setContent(buffer.toString());
        return pageData.getHtml();
    }
}


interface WikiPagePath {

}

interface PageData {
    WikiPage getWikiPage();

    boolean hasAttribute(String s);

    String getContent();

    void setContent(String s);

    String getHtml();
}

interface WikiPage {
    PageCrawlerImpl getPageCrawler();
}

class PageCrawlerImpl {
    static WikiPage getInheritedPage(String s, WikiPage wikipage) {
        return wikipage;
    }

    static WikiPagePath getFullPath(WikiPage w) {
        return null;
    }
}

class Responder {
    final static String SETUP_NAME = "";
    final static String TEARDOWN_NAME = "";
}

class PathParser {
    static String render(WikiPagePath pagePath) {
        return "";
    }
}