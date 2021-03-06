PGDMP         7                x            ddkg515k0b02ub     12.3 (Ubuntu 12.3-1.pgdg16.04+1)    12.2 q    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16643926    ddkg515k0b02ub    DATABASE     �   CREATE DATABASE ddkg515k0b02ub WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';
    DROP DATABASE ddkg515k0b02ub;
                xpblgtjbdhncyc    false            �           0    0    DATABASE ddkg515k0b02ub    ACL     A   REVOKE CONNECT,TEMPORARY ON DATABASE ddkg515k0b02ub FROM PUBLIC;
                   xpblgtjbdhncyc    false    3993            �           0    0    SCHEMA public    ACL     �   REVOKE ALL ON SCHEMA public FROM postgres;
REVOKE ALL ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO xpblgtjbdhncyc;
GRANT ALL ON SCHEMA public TO PUBLIC;
                   xpblgtjbdhncyc    false    3            �           0    0    LANGUAGE plpgsql    ACL     1   GRANT ALL ON LANGUAGE plpgsql TO xpblgtjbdhncyc;
                   postgres    false    706            �            1259    17379847    enfermedad_medicamento    TABLE     v   CREATE TABLE public.enfermedad_medicamento (
    medicamento_id bigint NOT NULL,
    enfermedad_id bigint NOT NULL
);
 *   DROP TABLE public.enfermedad_medicamento;
       public         heap    xpblgtjbdhncyc    false            �            1259    17389399    tbl_caracteristica    TABLE     �  CREATE TABLE public.tbl_caracteristica (
    id bigint NOT NULL,
    advertencia character varying(255),
    composicion character varying(255),
    concentracion character varying(255),
    fecha_expiracion timestamp without time zone,
    leyenda character varying(255),
    nombre_generico character varying(255),
    numero_registro_sanitario character varying(255),
    id_condicion_almacenamiento bigint,
    id_fabricante bigint,
    id_forma_farmaceutica bigint,
    id_via_administracion bigint
);
 &   DROP TABLE public.tbl_caracteristica;
       public         heap    xpblgtjbdhncyc    false            �            1259    17389397    tbl_caracteristica_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_caracteristica_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.tbl_caracteristica_id_seq;
       public          xpblgtjbdhncyc    false    226            �           0    0    tbl_caracteristica_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.tbl_caracteristica_id_seq OWNED BY public.tbl_caracteristica.id;
          public          xpblgtjbdhncyc    false    225            �            1259    17330812    tbl_condicion_almacenamiento    TABLE     �   CREATE TABLE public.tbl_condicion_almacenamiento (
    id bigint NOT NULL,
    humedad character varying(255),
    temperatura double precision
);
 0   DROP TABLE public.tbl_condicion_almacenamiento;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330810 #   tbl_condicion_almacenamiento_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_condicion_almacenamiento_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 :   DROP SEQUENCE public.tbl_condicion_almacenamiento_id_seq;
       public          xpblgtjbdhncyc    false    203            �           0    0 #   tbl_condicion_almacenamiento_id_seq    SEQUENCE OWNED BY     k   ALTER SEQUENCE public.tbl_condicion_almacenamiento_id_seq OWNED BY public.tbl_condicion_almacenamiento.id;
          public          xpblgtjbdhncyc    false    202            �            1259    17330820    tbl_detalle_transaccion    TABLE     �   CREATE TABLE public.tbl_detalle_transaccion (
    id bigint NOT NULL,
    fecha_emision timestamp without time zone,
    total_venta double precision,
    id_tipo_transaccion bigint,
    persona character varying(255)
);
 +   DROP TABLE public.tbl_detalle_transaccion;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330818    tbl_detalle_transaccion_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_detalle_transaccion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.tbl_detalle_transaccion_id_seq;
       public          xpblgtjbdhncyc    false    205            �           0    0    tbl_detalle_transaccion_id_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.tbl_detalle_transaccion_id_seq OWNED BY public.tbl_detalle_transaccion.id;
          public          xpblgtjbdhncyc    false    204            �            1259    17379852    tbl_enfermedad    TABLE     �   CREATE TABLE public.tbl_enfermedad (
    id bigint NOT NULL,
    descripcion character varying(255),
    mortalidad character varying(255),
    nombre character varying(255),
    tipo character varying(255),
    transmisible boolean NOT NULL
);
 "   DROP TABLE public.tbl_enfermedad;
       public         heap    xpblgtjbdhncyc    false            �            1259    17379850    tbl_enfermedad_id_seq    SEQUENCE     ~   CREATE SEQUENCE public.tbl_enfermedad_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.tbl_enfermedad_id_seq;
       public          xpblgtjbdhncyc    false    222            �           0    0    tbl_enfermedad_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.tbl_enfermedad_id_seq OWNED BY public.tbl_enfermedad.id;
          public          xpblgtjbdhncyc    false    221            �            1259    17330839    tbl_fabricante    TABLE       CREATE TABLE public.tbl_fabricante (
    id bigint NOT NULL,
    ciudad character varying(255),
    correo character varying(255),
    direccion character varying(255),
    pais character varying(255),
    razon_social character varying(255),
    telefono character varying(255)
);
 "   DROP TABLE public.tbl_fabricante;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330837    tbl_fabricante_id_seq    SEQUENCE     ~   CREATE SEQUENCE public.tbl_fabricante_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.tbl_fabricante_id_seq;
       public          xpblgtjbdhncyc    false    207            �           0    0    tbl_fabricante_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.tbl_fabricante_id_seq OWNED BY public.tbl_fabricante.id;
          public          xpblgtjbdhncyc    false    206            �            1259    17330850    tbl_forma_farmaceutica    TABLE     j   CREATE TABLE public.tbl_forma_farmaceutica (
    id bigint NOT NULL,
    nombre character varying(255)
);
 *   DROP TABLE public.tbl_forma_farmaceutica;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330848    tbl_forma_farmaceutica_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_forma_farmaceutica_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.tbl_forma_farmaceutica_id_seq;
       public          xpblgtjbdhncyc    false    209            �           0    0    tbl_forma_farmaceutica_id_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.tbl_forma_farmaceutica_id_seq OWNED BY public.tbl_forma_farmaceutica.id;
          public          xpblgtjbdhncyc    false    208            �            1259    17330866    tbl_indicacion_genral    TABLE     �   CREATE TABLE public.tbl_indicacion_genral (
    id bigint NOT NULL,
    concepto character varying(255),
    receta_id bigint
);
 )   DROP TABLE public.tbl_indicacion_genral;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330864    tbl_indicacion_genral_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_indicacion_genral_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.tbl_indicacion_genral_id_seq;
       public          xpblgtjbdhncyc    false    213            �           0    0    tbl_indicacion_genral_id_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.tbl_indicacion_genral_id_seq OWNED BY public.tbl_indicacion_genral.id;
          public          xpblgtjbdhncyc    false    212            �            1259    17330858    tbl_indicacion_medicamento    TABLE     �   CREATE TABLE public.tbl_indicacion_medicamento (
    id bigint NOT NULL,
    dias_tratamiento double precision,
    dosis character varying(255),
    frecuencia double precision,
    id_medicamento bigint,
    receta_id bigint
);
 .   DROP TABLE public.tbl_indicacion_medicamento;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330856 !   tbl_indicacion_medicamento_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_indicacion_medicamento_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE public.tbl_indicacion_medicamento_id_seq;
       public          xpblgtjbdhncyc    false    211            �           0    0 !   tbl_indicacion_medicamento_id_seq    SEQUENCE OWNED BY     g   ALTER SEQUENCE public.tbl_indicacion_medicamento_id_seq OWNED BY public.tbl_indicacion_medicamento.id;
          public          xpblgtjbdhncyc    false    210            �            1259    17379863    tbl_medicamento    TABLE     �  CREATE TABLE public.tbl_medicamento (
    id bigint NOT NULL,
    activo_medicamento boolean,
    codigo_medicamento bigint,
    codigo_barra character varying(255),
    fecha_creacion timestamp without time zone,
    inventario_minimo bigint,
    nombre_comercial character varying(255),
    precio_compra double precision,
    precio_venta double precision,
    id_caracteristica bigint
);
 #   DROP TABLE public.tbl_medicamento;
       public         heap    xpblgtjbdhncyc    false            �            1259    17379861    tbl_medicamento_id_seq    SEQUENCE        CREATE SEQUENCE public.tbl_medicamento_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.tbl_medicamento_id_seq;
       public          xpblgtjbdhncyc    false    224            �           0    0    tbl_medicamento_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.tbl_medicamento_id_seq OWNED BY public.tbl_medicamento.id;
          public          xpblgtjbdhncyc    false    223            �            1259    17424049 
   tbl_receta    TABLE     �   CREATE TABLE public.tbl_receta (
    id bigint NOT NULL,
    fecha_emision timestamp without time zone,
    id_medico bigint,
    id_paciente bigint
);
    DROP TABLE public.tbl_receta;
       public         heap    xpblgtjbdhncyc    false            �            1259    17424047    tbl_receta_id_seq    SEQUENCE     z   CREATE SEQUENCE public.tbl_receta_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.tbl_receta_id_seq;
       public          xpblgtjbdhncyc    false    228            �           0    0    tbl_receta_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.tbl_receta_id_seq OWNED BY public.tbl_receta.id;
          public          xpblgtjbdhncyc    false    227            �            1259    17330896    tbl_tipo_transaccion    TABLE     r   CREATE TABLE public.tbl_tipo_transaccion (
    id bigint NOT NULL,
    tipo_transaccion character varying(255)
);
 (   DROP TABLE public.tbl_tipo_transaccion;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330894    tbl_tipo_transaccion_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_tipo_transaccion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.tbl_tipo_transaccion_id_seq;
       public          xpblgtjbdhncyc    false    215            �           0    0    tbl_tipo_transaccion_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.tbl_tipo_transaccion_id_seq OWNED BY public.tbl_tipo_transaccion.id;
          public          xpblgtjbdhncyc    false    214            �            1259    17330904    tbl_transaccion    TABLE     �   CREATE TABLE public.tbl_transaccion (
    id bigint NOT NULL,
    cantidad_producto bigint,
    id_detalle bigint,
    id_medicamento bigint
);
 #   DROP TABLE public.tbl_transaccion;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330902    tbl_transaccion_id_seq    SEQUENCE        CREATE SEQUENCE public.tbl_transaccion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.tbl_transaccion_id_seq;
       public          xpblgtjbdhncyc    false    217            �           0    0    tbl_transaccion_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.tbl_transaccion_id_seq OWNED BY public.tbl_transaccion.id;
          public          xpblgtjbdhncyc    false    216            �            1259    17330912    tbl_via_administracion    TABLE     j   CREATE TABLE public.tbl_via_administracion (
    id bigint NOT NULL,
    nombre character varying(255)
);
 *   DROP TABLE public.tbl_via_administracion;
       public         heap    xpblgtjbdhncyc    false            �            1259    17330910    tbl_via_administracion_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_via_administracion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.tbl_via_administracion_id_seq;
       public          xpblgtjbdhncyc    false    219            �           0    0    tbl_via_administracion_id_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.tbl_via_administracion_id_seq OWNED BY public.tbl_via_administracion.id;
          public          xpblgtjbdhncyc    false    218            �           2604    17389402    tbl_caracteristica id    DEFAULT     ~   ALTER TABLE ONLY public.tbl_caracteristica ALTER COLUMN id SET DEFAULT nextval('public.tbl_caracteristica_id_seq'::regclass);
 D   ALTER TABLE public.tbl_caracteristica ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    226    225    226            �           2604    17330815    tbl_condicion_almacenamiento id    DEFAULT     �   ALTER TABLE ONLY public.tbl_condicion_almacenamiento ALTER COLUMN id SET DEFAULT nextval('public.tbl_condicion_almacenamiento_id_seq'::regclass);
 N   ALTER TABLE public.tbl_condicion_almacenamiento ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    203    202    203            �           2604    17330823    tbl_detalle_transaccion id    DEFAULT     �   ALTER TABLE ONLY public.tbl_detalle_transaccion ALTER COLUMN id SET DEFAULT nextval('public.tbl_detalle_transaccion_id_seq'::regclass);
 I   ALTER TABLE public.tbl_detalle_transaccion ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    205    204    205            �           2604    17379855    tbl_enfermedad id    DEFAULT     v   ALTER TABLE ONLY public.tbl_enfermedad ALTER COLUMN id SET DEFAULT nextval('public.tbl_enfermedad_id_seq'::regclass);
 @   ALTER TABLE public.tbl_enfermedad ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    222    221    222            �           2604    17330842    tbl_fabricante id    DEFAULT     v   ALTER TABLE ONLY public.tbl_fabricante ALTER COLUMN id SET DEFAULT nextval('public.tbl_fabricante_id_seq'::regclass);
 @   ALTER TABLE public.tbl_fabricante ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    206    207    207            �           2604    17330853    tbl_forma_farmaceutica id    DEFAULT     �   ALTER TABLE ONLY public.tbl_forma_farmaceutica ALTER COLUMN id SET DEFAULT nextval('public.tbl_forma_farmaceutica_id_seq'::regclass);
 H   ALTER TABLE public.tbl_forma_farmaceutica ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    209    208    209            �           2604    17330869    tbl_indicacion_genral id    DEFAULT     �   ALTER TABLE ONLY public.tbl_indicacion_genral ALTER COLUMN id SET DEFAULT nextval('public.tbl_indicacion_genral_id_seq'::regclass);
 G   ALTER TABLE public.tbl_indicacion_genral ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    212    213    213            �           2604    17330861    tbl_indicacion_medicamento id    DEFAULT     �   ALTER TABLE ONLY public.tbl_indicacion_medicamento ALTER COLUMN id SET DEFAULT nextval('public.tbl_indicacion_medicamento_id_seq'::regclass);
 L   ALTER TABLE public.tbl_indicacion_medicamento ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    211    210    211            �           2604    17379866    tbl_medicamento id    DEFAULT     x   ALTER TABLE ONLY public.tbl_medicamento ALTER COLUMN id SET DEFAULT nextval('public.tbl_medicamento_id_seq'::regclass);
 A   ALTER TABLE public.tbl_medicamento ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    223    224    224            �           2604    17424052    tbl_receta id    DEFAULT     n   ALTER TABLE ONLY public.tbl_receta ALTER COLUMN id SET DEFAULT nextval('public.tbl_receta_id_seq'::regclass);
 <   ALTER TABLE public.tbl_receta ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    227    228    228            �           2604    17330899    tbl_tipo_transaccion id    DEFAULT     �   ALTER TABLE ONLY public.tbl_tipo_transaccion ALTER COLUMN id SET DEFAULT nextval('public.tbl_tipo_transaccion_id_seq'::regclass);
 F   ALTER TABLE public.tbl_tipo_transaccion ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    215    214    215            �           2604    17330907    tbl_transaccion id    DEFAULT     x   ALTER TABLE ONLY public.tbl_transaccion ALTER COLUMN id SET DEFAULT nextval('public.tbl_transaccion_id_seq'::regclass);
 A   ALTER TABLE public.tbl_transaccion ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    217    216    217            �           2604    17330915    tbl_via_administracion id    DEFAULT     �   ALTER TABLE ONLY public.tbl_via_administracion ALTER COLUMN id SET DEFAULT nextval('public.tbl_via_administracion_id_seq'::regclass);
 H   ALTER TABLE public.tbl_via_administracion ALTER COLUMN id DROP DEFAULT;
       public          xpblgtjbdhncyc    false    219    218    219            �          0    17379847    enfermedad_medicamento 
   TABLE DATA           O   COPY public.enfermedad_medicamento (medicamento_id, enfermedad_id) FROM stdin;
    public          xpblgtjbdhncyc    false    220   7�       �          0    17389399    tbl_caracteristica 
   TABLE DATA           �   COPY public.tbl_caracteristica (id, advertencia, composicion, concentracion, fecha_expiracion, leyenda, nombre_generico, numero_registro_sanitario, id_condicion_almacenamiento, id_fabricante, id_forma_farmaceutica, id_via_administracion) FROM stdin;
    public          xpblgtjbdhncyc    false    226   c�       z          0    17330812    tbl_condicion_almacenamiento 
   TABLE DATA           P   COPY public.tbl_condicion_almacenamiento (id, humedad, temperatura) FROM stdin;
    public          xpblgtjbdhncyc    false    203   �       |          0    17330820    tbl_detalle_transaccion 
   TABLE DATA           o   COPY public.tbl_detalle_transaccion (id, fecha_emision, total_venta, id_tipo_transaccion, persona) FROM stdin;
    public          xpblgtjbdhncyc    false    205   O�       �          0    17379852    tbl_enfermedad 
   TABLE DATA           a   COPY public.tbl_enfermedad (id, descripcion, mortalidad, nombre, tipo, transmisible) FROM stdin;
    public          xpblgtjbdhncyc    false    222   l�       ~          0    17330839    tbl_fabricante 
   TABLE DATA           e   COPY public.tbl_fabricante (id, ciudad, correo, direccion, pais, razon_social, telefono) FROM stdin;
    public          xpblgtjbdhncyc    false    207   ��       �          0    17330850    tbl_forma_farmaceutica 
   TABLE DATA           <   COPY public.tbl_forma_farmaceutica (id, nombre) FROM stdin;
    public          xpblgtjbdhncyc    false    209   ��       �          0    17330866    tbl_indicacion_genral 
   TABLE DATA           H   COPY public.tbl_indicacion_genral (id, concepto, receta_id) FROM stdin;
    public          xpblgtjbdhncyc    false    213   �       �          0    17330858    tbl_indicacion_medicamento 
   TABLE DATA           x   COPY public.tbl_indicacion_medicamento (id, dias_tratamiento, dosis, frecuencia, id_medicamento, receta_id) FROM stdin;
    public          xpblgtjbdhncyc    false    211   �       �          0    17379863    tbl_medicamento 
   TABLE DATA           �   COPY public.tbl_medicamento (id, activo_medicamento, codigo_medicamento, codigo_barra, fecha_creacion, inventario_minimo, nombre_comercial, precio_compra, precio_venta, id_caracteristica) FROM stdin;
    public          xpblgtjbdhncyc    false    224   <�       �          0    17424049 
   tbl_receta 
   TABLE DATA           O   COPY public.tbl_receta (id, fecha_emision, id_medico, id_paciente) FROM stdin;
    public          xpblgtjbdhncyc    false    228   ܖ       �          0    17330896    tbl_tipo_transaccion 
   TABLE DATA           D   COPY public.tbl_tipo_transaccion (id, tipo_transaccion) FROM stdin;
    public          xpblgtjbdhncyc    false    215   ��       �          0    17330904    tbl_transaccion 
   TABLE DATA           \   COPY public.tbl_transaccion (id, cantidad_producto, id_detalle, id_medicamento) FROM stdin;
    public          xpblgtjbdhncyc    false    217   �       �          0    17330912    tbl_via_administracion 
   TABLE DATA           <   COPY public.tbl_via_administracion (id, nombre) FROM stdin;
    public          xpblgtjbdhncyc    false    219   3�       �           0    0    tbl_caracteristica_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.tbl_caracteristica_id_seq', 9, true);
          public          xpblgtjbdhncyc    false    225            �           0    0 #   tbl_condicion_almacenamiento_id_seq    SEQUENCE SET     Q   SELECT pg_catalog.setval('public.tbl_condicion_almacenamiento_id_seq', 2, true);
          public          xpblgtjbdhncyc    false    202            �           0    0    tbl_detalle_transaccion_id_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public.tbl_detalle_transaccion_id_seq', 1, false);
          public          xpblgtjbdhncyc    false    204            �           0    0    tbl_enfermedad_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.tbl_enfermedad_id_seq', 3, true);
          public          xpblgtjbdhncyc    false    221            �           0    0    tbl_fabricante_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.tbl_fabricante_id_seq', 6, true);
          public          xpblgtjbdhncyc    false    206            �           0    0    tbl_forma_farmaceutica_id_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.tbl_forma_farmaceutica_id_seq', 5, true);
          public          xpblgtjbdhncyc    false    208            �           0    0    tbl_indicacion_genral_id_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.tbl_indicacion_genral_id_seq', 1, false);
          public          xpblgtjbdhncyc    false    212            �           0    0 !   tbl_indicacion_medicamento_id_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.tbl_indicacion_medicamento_id_seq', 1, false);
          public          xpblgtjbdhncyc    false    210            �           0    0    tbl_medicamento_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.tbl_medicamento_id_seq', 3, true);
          public          xpblgtjbdhncyc    false    223            �           0    0    tbl_receta_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.tbl_receta_id_seq', 1, false);
          public          xpblgtjbdhncyc    false    227            �           0    0    tbl_tipo_transaccion_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.tbl_tipo_transaccion_id_seq', 1, false);
          public          xpblgtjbdhncyc    false    214            �           0    0    tbl_transaccion_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.tbl_transaccion_id_seq', 1, false);
          public          xpblgtjbdhncyc    false    216            �           0    0    tbl_via_administracion_id_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.tbl_via_administracion_id_seq', 8, true);
          public          xpblgtjbdhncyc    false    218            �           2606    17389407 *   tbl_caracteristica tbl_caracteristica_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.tbl_caracteristica
    ADD CONSTRAINT tbl_caracteristica_pkey PRIMARY KEY (id);
 T   ALTER TABLE ONLY public.tbl_caracteristica DROP CONSTRAINT tbl_caracteristica_pkey;
       public            xpblgtjbdhncyc    false    226            �           2606    17330817 >   tbl_condicion_almacenamiento tbl_condicion_almacenamiento_pkey 
   CONSTRAINT     |   ALTER TABLE ONLY public.tbl_condicion_almacenamiento
    ADD CONSTRAINT tbl_condicion_almacenamiento_pkey PRIMARY KEY (id);
 h   ALTER TABLE ONLY public.tbl_condicion_almacenamiento DROP CONSTRAINT tbl_condicion_almacenamiento_pkey;
       public            xpblgtjbdhncyc    false    203            �           2606    17330825 4   tbl_detalle_transaccion tbl_detalle_transaccion_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public.tbl_detalle_transaccion
    ADD CONSTRAINT tbl_detalle_transaccion_pkey PRIMARY KEY (id);
 ^   ALTER TABLE ONLY public.tbl_detalle_transaccion DROP CONSTRAINT tbl_detalle_transaccion_pkey;
       public            xpblgtjbdhncyc    false    205            �           2606    17379860 "   tbl_enfermedad tbl_enfermedad_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.tbl_enfermedad
    ADD CONSTRAINT tbl_enfermedad_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.tbl_enfermedad DROP CONSTRAINT tbl_enfermedad_pkey;
       public            xpblgtjbdhncyc    false    222            �           2606    17330847 "   tbl_fabricante tbl_fabricante_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.tbl_fabricante
    ADD CONSTRAINT tbl_fabricante_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.tbl_fabricante DROP CONSTRAINT tbl_fabricante_pkey;
       public            xpblgtjbdhncyc    false    207            �           2606    17330855 2   tbl_forma_farmaceutica tbl_forma_farmaceutica_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_forma_farmaceutica
    ADD CONSTRAINT tbl_forma_farmaceutica_pkey PRIMARY KEY (id);
 \   ALTER TABLE ONLY public.tbl_forma_farmaceutica DROP CONSTRAINT tbl_forma_farmaceutica_pkey;
       public            xpblgtjbdhncyc    false    209            �           2606    17330871 0   tbl_indicacion_genral tbl_indicacion_genral_pkey 
   CONSTRAINT     n   ALTER TABLE ONLY public.tbl_indicacion_genral
    ADD CONSTRAINT tbl_indicacion_genral_pkey PRIMARY KEY (id);
 Z   ALTER TABLE ONLY public.tbl_indicacion_genral DROP CONSTRAINT tbl_indicacion_genral_pkey;
       public            xpblgtjbdhncyc    false    213            �           2606    17330863 :   tbl_indicacion_medicamento tbl_indicacion_medicamento_pkey 
   CONSTRAINT     x   ALTER TABLE ONLY public.tbl_indicacion_medicamento
    ADD CONSTRAINT tbl_indicacion_medicamento_pkey PRIMARY KEY (id);
 d   ALTER TABLE ONLY public.tbl_indicacion_medicamento DROP CONSTRAINT tbl_indicacion_medicamento_pkey;
       public            xpblgtjbdhncyc    false    211            �           2606    17379871 $   tbl_medicamento tbl_medicamento_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.tbl_medicamento
    ADD CONSTRAINT tbl_medicamento_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.tbl_medicamento DROP CONSTRAINT tbl_medicamento_pkey;
       public            xpblgtjbdhncyc    false    224            �           2606    17424054    tbl_receta tbl_receta_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.tbl_receta
    ADD CONSTRAINT tbl_receta_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.tbl_receta DROP CONSTRAINT tbl_receta_pkey;
       public            xpblgtjbdhncyc    false    228            �           2606    17330901 .   tbl_tipo_transaccion tbl_tipo_transaccion_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.tbl_tipo_transaccion
    ADD CONSTRAINT tbl_tipo_transaccion_pkey PRIMARY KEY (id);
 X   ALTER TABLE ONLY public.tbl_tipo_transaccion DROP CONSTRAINT tbl_tipo_transaccion_pkey;
       public            xpblgtjbdhncyc    false    215            �           2606    17330909 $   tbl_transaccion tbl_transaccion_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.tbl_transaccion
    ADD CONSTRAINT tbl_transaccion_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.tbl_transaccion DROP CONSTRAINT tbl_transaccion_pkey;
       public            xpblgtjbdhncyc    false    217            �           2606    17330917 2   tbl_via_administracion tbl_via_administracion_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_via_administracion
    ADD CONSTRAINT tbl_via_administracion_pkey PRIMARY KEY (id);
 \   ALTER TABLE ONLY public.tbl_via_administracion DROP CONSTRAINT tbl_via_administracion_pkey;
       public            xpblgtjbdhncyc    false    219            �           2606    17389413 .   tbl_caracteristica fk3ul4usrhvhlrq46ivdtkq6oju    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_caracteristica
    ADD CONSTRAINT fk3ul4usrhvhlrq46ivdtkq6oju FOREIGN KEY (id_fabricante) REFERENCES public.tbl_fabricante(id);
 X   ALTER TABLE ONLY public.tbl_caracteristica DROP CONSTRAINT fk3ul4usrhvhlrq46ivdtkq6oju;
       public          xpblgtjbdhncyc    false    207    3801    226            �           2606    17379872 2   enfermedad_medicamento fk4gieecqmr7y5vyihaub4nv3j4    FK CONSTRAINT     �   ALTER TABLE ONLY public.enfermedad_medicamento
    ADD CONSTRAINT fk4gieecqmr7y5vyihaub4nv3j4 FOREIGN KEY (enfermedad_id) REFERENCES public.tbl_enfermedad(id);
 \   ALTER TABLE ONLY public.enfermedad_medicamento DROP CONSTRAINT fk4gieecqmr7y5vyihaub4nv3j4;
       public          xpblgtjbdhncyc    false    220    3815    222            �           2606    17389408 .   tbl_caracteristica fk5igj1ojy8bc3xh462ga3cth79    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_caracteristica
    ADD CONSTRAINT fk5igj1ojy8bc3xh462ga3cth79 FOREIGN KEY (id_condicion_almacenamiento) REFERENCES public.tbl_condicion_almacenamiento(id);
 X   ALTER TABLE ONLY public.tbl_caracteristica DROP CONSTRAINT fk5igj1ojy8bc3xh462ga3cth79;
       public          xpblgtjbdhncyc    false    3797    226    203            �           2606    17379892 +   tbl_transaccion fkags5g1l5vx8euirxnenid6r46    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_transaccion
    ADD CONSTRAINT fkags5g1l5vx8euirxnenid6r46 FOREIGN KEY (id_medicamento) REFERENCES public.tbl_medicamento(id);
 U   ALTER TABLE ONLY public.tbl_transaccion DROP CONSTRAINT fkags5g1l5vx8euirxnenid6r46;
       public          xpblgtjbdhncyc    false    224    217    3817            �           2606    17424055 6   tbl_indicacion_medicamento fkat75io8q5ebve0ngakn2l2ghy    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_indicacion_medicamento
    ADD CONSTRAINT fkat75io8q5ebve0ngakn2l2ghy FOREIGN KEY (receta_id) REFERENCES public.tbl_receta(id);
 `   ALTER TABLE ONLY public.tbl_indicacion_medicamento DROP CONSTRAINT fkat75io8q5ebve0ngakn2l2ghy;
       public          xpblgtjbdhncyc    false    228    211    3821            �           2606    17389418 .   tbl_caracteristica fkbw6mxn1ikpx4dwkj2rh5dbvje    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_caracteristica
    ADD CONSTRAINT fkbw6mxn1ikpx4dwkj2rh5dbvje FOREIGN KEY (id_forma_farmaceutica) REFERENCES public.tbl_forma_farmaceutica(id);
 X   ALTER TABLE ONLY public.tbl_caracteristica DROP CONSTRAINT fkbw6mxn1ikpx4dwkj2rh5dbvje;
       public          xpblgtjbdhncyc    false    226    209    3803            �           2606    17379882 6   tbl_indicacion_medicamento fknvdv36i6rkqvhdgbute2c2y0j    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_indicacion_medicamento
    ADD CONSTRAINT fknvdv36i6rkqvhdgbute2c2y0j FOREIGN KEY (id_medicamento) REFERENCES public.tbl_medicamento(id);
 `   ALTER TABLE ONLY public.tbl_indicacion_medicamento DROP CONSTRAINT fknvdv36i6rkqvhdgbute2c2y0j;
       public          xpblgtjbdhncyc    false    3817    211    224            �           2606    17389428 +   tbl_medicamento fkopbo82lcwircjl4kpix38kmtj    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_medicamento
    ADD CONSTRAINT fkopbo82lcwircjl4kpix38kmtj FOREIGN KEY (id_caracteristica) REFERENCES public.tbl_caracteristica(id);
 U   ALTER TABLE ONLY public.tbl_medicamento DROP CONSTRAINT fkopbo82lcwircjl4kpix38kmtj;
       public          xpblgtjbdhncyc    false    226    3819    224            �           2606    17330948 2   tbl_detalle_transaccion fkpg8uu68llva5jxq2f9tebvv1    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_detalle_transaccion
    ADD CONSTRAINT fkpg8uu68llva5jxq2f9tebvv1 FOREIGN KEY (id_tipo_transaccion) REFERENCES public.tbl_tipo_transaccion(id);
 \   ALTER TABLE ONLY public.tbl_detalle_transaccion DROP CONSTRAINT fkpg8uu68llva5jxq2f9tebvv1;
       public          xpblgtjbdhncyc    false    205    3809    215            �           2606    17424060 1   tbl_indicacion_genral fkploievyfn54trny5qc2wb6tw6    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_indicacion_genral
    ADD CONSTRAINT fkploievyfn54trny5qc2wb6tw6 FOREIGN KEY (receta_id) REFERENCES public.tbl_receta(id);
 [   ALTER TABLE ONLY public.tbl_indicacion_genral DROP CONSTRAINT fkploievyfn54trny5qc2wb6tw6;
       public          xpblgtjbdhncyc    false    228    213    3821            �           2606    17330973 +   tbl_transaccion fkq8x3xvtwbcuyga0lcnd920g6f    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_transaccion
    ADD CONSTRAINT fkq8x3xvtwbcuyga0lcnd920g6f FOREIGN KEY (id_detalle) REFERENCES public.tbl_detalle_transaccion(id);
 U   ALTER TABLE ONLY public.tbl_transaccion DROP CONSTRAINT fkq8x3xvtwbcuyga0lcnd920g6f;
       public          xpblgtjbdhncyc    false    3799    217    205            �           2606    17389423 .   tbl_caracteristica fksvnnbcmjqdgfgk5n0ot9dyok5    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_caracteristica
    ADD CONSTRAINT fksvnnbcmjqdgfgk5n0ot9dyok5 FOREIGN KEY (id_via_administracion) REFERENCES public.tbl_via_administracion(id);
 X   ALTER TABLE ONLY public.tbl_caracteristica DROP CONSTRAINT fksvnnbcmjqdgfgk5n0ot9dyok5;
       public          xpblgtjbdhncyc    false    3813    226    219            �           2606    17379877 2   enfermedad_medicamento fktmsck9r1lfg0s5ppb5cjuvrt6    FK CONSTRAINT     �   ALTER TABLE ONLY public.enfermedad_medicamento
    ADD CONSTRAINT fktmsck9r1lfg0s5ppb5cjuvrt6 FOREIGN KEY (medicamento_id) REFERENCES public.tbl_medicamento(id);
 \   ALTER TABLE ONLY public.enfermedad_medicamento DROP CONSTRAINT fktmsck9r1lfg0s5ppb5cjuvrt6;
       public          xpblgtjbdhncyc    false    220    3817    224            �      x�3�4�2�4�2��`l����� 'c�      �   �   x�m�=�0�g��@��[�, u�� ��4���`���~$
��l?�z���j�|k�q�a�	F/��������	n��C
��|���upuk<-�Ai���:18(���������^C�'K]Z���B���'��/~S��g�Ï/t*�ң:5#�!�eBs      z   '   x�3�NMN�46�3�2�t�M�L�+I�42������ w�      |      x������ � �      �   ~   x�m�1�0���9EN�TX航rY�A��XrҞ�0 1t}�����Țq2��M}�tI4٦<�T�,qN��`Q+�±�⟞�n)Ki]��u����%������%�R����i����!����80      ~   �   x�mO1�0��W���IKE7$Ll,W���*M3��$-ݪ���l��Bk�	���t�c����&d��ݍn�8y��`�@4C'�c�H�T+�7�a"R���I�:=��ﭖD��"� ��~��S��8�Ͱ,㊮���鱀n�bڸa��Q]׺�ӊ�3� �KU*      �   9   x�3����LI�2�N��,�p�9}2KA,N��������b.Sΐ���=... �      �      x������ � �      �      x������ � �      �   �   x�]�M
�0����@��d&&[7��t�B�6����Յ <���=��+02�[�9K̪^�ӭ,�ѯ�UGP0��?�X��'�ĄY�ć<�q���S����d���H����(y�t�\��6/��O��\�so��(      �      x������ � �      �      x������ � �      �      x������ � �      �   Y   x�3��/J��2��/�LN�2�)J�+NI-�qM8��Js�lSN�m��WT�X�h�d$�$��e&rYp��&%r��qqq )O     