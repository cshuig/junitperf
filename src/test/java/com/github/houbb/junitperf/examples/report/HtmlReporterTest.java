package com.github.houbb.junitperf.examples.report;

import com.github.houbb.junitperf.core.annotation.JunitPerfConfig;
import com.github.houbb.junitperf.core.report.impl.HtmlReporter;

/**
 * <p> HTML 输出 </p>
 *
 * <pre> Created: 2018/7/2 上午11:03  </pre>
 * <pre> Project: junitperf  </pre>
 *
 * @author houbinbin
 * @version 1.0
 * @since JDK 1.7
 */
public class HtmlReporterTest {
    @JunitPerfConfig(duration = 1000, reporter = {HtmlReporter.class})
    public void helloTest() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Hello Junit5");
    }
}
