package com.example.q6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * リクエストパラメータ<code>linkTo</code>の値を見て、フォーワード先を切り替えなさい。
 * 以下のようになるようにしなさい。
 * <pre>
 * linkTo = "1"の時、遷移先は6/first.html。 http://localhost:8080/q6?linkTo=1
 * linkTo = "2"の時、遷移先は6/second.html。 http://localhost:8080/q6?linkTo=2
 * 1,2以外の場合は、RuntimeExceptionをthrowしてください。 http://localhost:8080/q6?linkTo=3
 * </pre>
 */
@Controller
public class ParamController {
	@RequestMapping(value="/q6")
	public String gotoq6(String linkTo){
		switch (linkTo) {
			case "1":
				return "6/first";
			
			case "2":
				return "6/second";

			default :
				throw new RuntimeException();
		}
	}
}
