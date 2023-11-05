package com.hcj.catoj.judge;

import com.hcj.catoj.judge.strategy.DefaultJudgeStrategy;
import com.hcj.catoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.hcj.catoj.judge.strategy.JudgeContext;
import com.hcj.catoj.judge.strategy.JudgeStrategy;
import com.hcj.catoj.judge.codesandbox.model.JudgeInfo;
import com.hcj.catoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
