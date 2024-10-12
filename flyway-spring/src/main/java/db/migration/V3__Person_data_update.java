package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.PreparedStatement;

public class V3__Person_data_update extends BaseJavaMigration {

    @Override
    public void migrate(Context context) throws Exception {
        //need connection
        PreparedStatement preparedStatement = context.getConnection().prepareStatement("update person set name=? where id < 2");
        preparedStatement.setString(1, "test");
        preparedStatement.executeUpdate();
    }
}
