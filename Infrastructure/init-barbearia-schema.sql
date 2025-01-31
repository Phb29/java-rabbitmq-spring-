DO $$
BEGIN
  IF NOT EXISTS(
    SELECT schema_name
    FROM information_schema.schemata
    WHERE schema_name = 'barbearia_schema'
  ) THEN
      EXECUTE 'CREATE SCHEMA barbearia_schema';
  END IF;
END 
$$;