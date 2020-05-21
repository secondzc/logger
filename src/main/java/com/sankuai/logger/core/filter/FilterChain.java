package com.sankuai.logger.core.filter;

import com.google.common.collect.Lists;
import com.sankuai.logger.core.LoggingEvent;
import com.sankuai.logger.util.LogUtil;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

public class FilterChain {
    private List<Filter> filterList = Lists.newLinkedList();

    public boolean isIntercept(LoggingEvent event) {
        if (CollectionUtils.isEmpty(filterList)) {
            return false;
        }
        for (int i = 0; i < filterList.size(); i++) {
            FilterDecision decision = filterList.get(i).getDecision(event);
            switch (decision) {
                case NEUTRAL: continue;
                case ACCEPT: return false;
                case DENY: return true;
            }
        }
        LogUtil.log("all filters are neutral, not intercept by default");
        return false;
    }

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void clearFilters() {
        filterList = Lists.newLinkedList();
    }
}
