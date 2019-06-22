package com.github.mosen;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Type;
import org.apache.kafka.common.config.ConfigDef.Importance;
import com.github.jcustenborder.kafka.connect.utils.config.ConfigKeyBuilder;
import java.util.Map;



public class AzureStorageSourceConnectorConfig extends AbstractConfig {

  public static final String AZURE_CONNECTION_STRING_CONFIG = "azure.connectionstring";
  private static final String AZURE_CONNECTION_STRING_DOC = "The Azure storage account connection string as shown in " +
          "the portal";

  public static final String AZURE_STORAGE_TYPE_CONFIG = "azure.storage.type";
  private static final String AZURE_STORAGE_TYPE_DOC = "The type of Azure storage being read. Only `table` is " +
          "supported right now.";

  public static final String AZURE_TABLE_NAME_CONFIG = "azure.table.name";
  private static final String AZURE_TABLE_NAME_DOC = "The name of the table to use as a source";

  public final String azureConnectionString;

  public AzureStorageSourceConnectorConfig(Map<?, ?> originals) {
    super(config(), originals);
    this.azureConnectionString = this.getString(AZURE_CONNECTION_STRING_CONFIG);
  }

  public static ConfigDef config() {
    return new ConfigDef()
        .define(
            ConfigKeyBuilder.of(AZURE_CONNECTION_STRING_CONFIG, Type.STRING)
                .documentation(AZURE_CONNECTION_STRING_DOC)
                .importance(Importance.HIGH)
                .build()
        ).define(

          );
  }
}
