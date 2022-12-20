# Visual Studio Enterprise 2017 インストール

  ＊マイクロソフトアカウントが必要です。

1. [ダウンロードサイト](https://my.visualstudio.com/Downloads?q=visual%20studio%202017&wt.mc_id=o~msft~vscom~older-downloads)にアクセスする。

2. Trial版の`Visual Studio Enterprise 2017`をダウンロードする

![image](https://user-images.githubusercontent.com/107240396/208396155-56214ccb-b15e-41c2-89a8-7f41e4579d51.png)

3. ダウンロードした`vs_Enterprise.exe`を実行

![image](https://user-images.githubusercontent.com/107240396/208397868-a3f341fb-7a4e-42fb-acc7-e4f9297ed739.png)

4. インストーラの案内に従って進める

![image](https://user-images.githubusercontent.com/107240396/208398363-3f795d11-28cd-4871-9a2f-74452a3f3d13.png)
![image](https://user-images.githubusercontent.com/107240396/208398439-3d62f4e2-d47e-4a92-a5ed-95b61c5c0226.png)

5. ワークロードタブから`.NETデスクトップ開発`と`ASP.NETとWEB開発`にチェックを入れる(後々追加や削除も可)

![image](https://user-images.githubusercontent.com/107240396/208399706-a31f59b9-fc18-4998-9eb2-0594770cec96.png)

6. インストールの場所タブからVisual Studio IDEのインストール先を設定する(任意の場所)

![image](https://user-images.githubusercontent.com/107240396/208627513-299267a9-8338-4e5d-a982-bb4ead6889a1.png)
![image](https://user-images.githubusercontent.com/107240396/208627759-1c18b233-e5c9-4d11-81e5-1c1efb334220.png)

7. インストールボタン押下でインストール開始(インストール後に起動、にチェックを入れておく)

![image](https://user-images.githubusercontent.com/107240396/208627948-6c6890f2-5101-4558-bbf6-70d578873382.png)

8. 初回起動時はサインインを求められるため、案内に従ってサインインを完了させる

![image](https://user-images.githubusercontent.com/107240396/208632122-e926f3f3-a80e-44a7-8689-459b4bff0bec.png)

9. 開発設定からVisual C#を選択、VisualStudioの開始ボタンを押下

![image](https://user-images.githubusercontent.com/107240396/208633189-497304b1-47b4-4709-a847-ce9a726cc6af.png)

9. Visual Studio 2017が起動

![image](https://user-images.githubusercontent.com/107240396/208629319-37d2d5c1-33ae-4bad-a333-bf6f3d48f14d.png)


# サンプルプロジェクトの作成

1. ファイル > 新規作成 > プロジェクトを選択

![image](https://user-images.githubusercontent.com/107240396/208630146-c54f9ac5-faa6-495b-aa53-b9450865b3ea.png)

2. コンソールアプリ(.NET Framework)を選択

![image](https://user-images.githubusercontent.com/107240396/208630403-b4d09e94-81f3-4c4c-afc6-dd53a66f5bc4.png)

3. 任意のプロジェクト名、保存先を指定しOKボタンを押下

![image](https://user-images.githubusercontent.com/107240396/208630953-8d26fd7f-027e-40c5-8224-8c6e12f86b56.png)

4. プロジェクトが作成される

![image](https://user-images.githubusercontent.com/107240396/208631413-375ba92e-1ec4-4e30-8812-0feb0a55a07c.png)

5. 自動的にProgram.csが作成され、以下の内容が記述されている

![image](https://user-images.githubusercontent.com/107240396/208634174-31f7629e-e2a4-49bc-b8fe-676ad5b1d420.png)

6. 「ツール > オプション」の「プロジェクトおよびソリューション > ビルド/実行」から、「実行時に、プロジェクトが最新の状態ではないとき」の項目を「常にビルドする」に設定し、OKボタンを押下

![image](https://user-images.githubusercontent.com/107240396/208635107-628ed4ea-6946-4f62-9c1a-9c1197326d4a.png)
![image](https://user-images.githubusercontent.com/107240396/208635438-8b110384-8dce-477f-aa6a-ded42f4c0a81.png)

7. Program.csを下記内容に書き換え、Ctrl + S で保存する
   (Console.ReadKey(true);がないと実行時にコンソール画面が一瞬で閉じられてしまうため記載)

![image](https://user-images.githubusercontent.com/107240396/208636151-2b145071-5a7b-4314-9f46-da0a40ab61f0.png)

8. F5キー押下、もしくは開始ボタンで実行。コンソールが立ち上がりHello World!が出力される

![image](https://user-images.githubusercontent.com/107240396/208637528-cf440044-2af1-4c32-9b3d-9660a95398dd.png)



