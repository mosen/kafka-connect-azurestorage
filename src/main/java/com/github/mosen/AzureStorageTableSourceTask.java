package com.github.mosen;

import org.apache.kafka.connect.data.Field;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.errors.ConnectException;
import org.apache.kafka.connect.source.SourceRecord;
import org.apache.kafka.connect.source.SourceTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.microsoft.azure.storage.*;
import com.microsoft.azure.storage.table.*;
import com.microsoft.azure.storage.table.TableQuery.*;


import java.util.List;
import java.util.Map;

public class AzureStorageTableSourceTask extends SourceTask {
  /*
    Your connector should never use System.out for logging. All of your classes should use slf4j
    for logging
 */
  static final Logger log = LoggerFactory.getLogger(AzureStorageTableSourceTask.class);

  private String tableName;
  private String partitionKey;


  @Override
  public String version() {
    return "1.0.0";
  }

  @Override
  public void start(Map<String, String> map) {
    //TODO: Do things here that are required to start your task. This could be open a connection to a database, etc.
  }

  @Override
  public List<SourceRecord> poll() throws InterruptedException {
    SourceRecord sr = new SourceRecord();
  }

  @Override
  public void stop() {
    //TODO: Do whatever is required to stop your task.
  }
}