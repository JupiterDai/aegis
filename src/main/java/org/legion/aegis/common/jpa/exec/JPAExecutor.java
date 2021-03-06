package org.legion.aegis.common.jpa.exec;



import org.legion.aegis.common.AppContext;
import org.legion.aegis.common.base.BasePO;
import org.legion.aegis.common.utils.BeanUtils;
import org.legion.aegis.common.utils.SpringUtils;

import java.util.Date;

public class JPAExecutor {

    private static final IExecutor executor = SpringUtils.getBean(IExecutor.class);

    public static void save(BasePO entity) {
        if (entity != null) {
            Date now = new Date();
            AppContext appContext = AppContext.getFromWebThread();
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            entity.setCreatedBy(appContext.getLoginId());
            entity.setUpdatedBy(appContext.getLoginId());
            BeanUtils.formatEmptyString(entity);
            executor.insert(entity);
        }
    }

    public static void update(BasePO entity) {
        if (entity != null) {
            Date now = new Date();
            AppContext appContext = AppContext.getFromWebThread();
            entity.setUpdatedAt(now);
            entity.setUpdatedBy(appContext.getLoginId());
            BeanUtils.formatEmptyString(entity);
            executor.update(entity);
        }
    }

    public static void delete(BasePO entity) {
        if (entity != null) {
            executor.delete(entity);
        }
    }
}
