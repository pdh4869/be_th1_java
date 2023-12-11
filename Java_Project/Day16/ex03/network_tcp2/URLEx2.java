package ex03.network_tcp2;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.google.com/search?q=kim+yuna&sca_esv=589698990&hl=ko&sxsrf=AM9HkKm5utIIM0mKw95Kvhi95w7MWUZAqQ%3A1702275474632&ei=kql2ZY6WJqfL1e8P6KWp2AY&ved=0ahUKEwiOp-an3oaDAxWnZfUHHehSCmsQ4dUDCBA&uact=5&oq=kim+yuna&gs_lp=Egxnd3Mtd2l6LXNlcnAiCGtpbSB5dW5hMgUQLhiABDIFEC4YgAQyBRAAGIAEMgUQABiABDIHEAAYgAQYCjIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAuGIAEMhQQLhiABBiXBRjcBBjeBBjfBNgBAUjmDVAAWPgMcAJ4AZABAJgBqQGgAacJqgEDMC45uAEDyAEA-AEBqAIUwgILEC4YgAQYsQMYgwHCAgsQABiABBixAxiDAcICERAuGIAEGLEDGIMBGMcBGNEDwgIUEC4YgAQYlwUY3AQY3gQY4ATYAQHCAg4QLhiABBixAxjHARjRA8ICCBAuGIAEGLEDwgIIEAAYgAQYsQPCAgcQIxjqAhgnwgIQEAAYAxiPARjqAhi0AtgBAsICEBAuGAMYjwEY6gIYtALYAQLCAgoQIxiABBiKBRgnwgIKEC4YgAQYigUYQ8ICCBAuGLEDGIAEwgIZEC4YgAQYigUYQxiXBRjcBBjeBBjfBNgBAcICBBAAGAPiAwQYACBBiAYBugYGCAEQARgUugYGCAIQARgK&sclient=gws-wiz-serp");
		
		System.out.println("프로토콜: "+url.getProtocol());
		System.out.println("호스트, 포트: "+url.getAuthority());
		System.out.println("호스트: "+url.getHost());
		System.out.println("포트: "+url.getPort());
		System.out.println("경로: "+url.getPath());
		System.out.println("질의: "+url.getQuery());
		System.out.println("파일명: "+url.getFile());
		System.out.println("참조: "+url.getRef());
		
	}
}
