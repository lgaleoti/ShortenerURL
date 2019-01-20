package com.shortener.url.servlet;

import javax.servlet.http.HttpServlet;

import com.shortener.url.ShortenerURL;

public class ShortenerURLServlet extends HttpServlet {

	public ShortenerURLServlet() {
		new ShortenerURL();
	}
}
